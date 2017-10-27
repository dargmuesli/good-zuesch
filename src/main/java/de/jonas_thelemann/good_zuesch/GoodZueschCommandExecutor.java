package de.jonas_thelemann.good_zuesch;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.File;

class GoodZueschCommandExecutor implements CommandExecutor {
    private final GoodZuesch plugin;

    public GoodZueschCommandExecutor(GoodZuesch plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("goodzuesch")) {
            return false;
        }

        if (args.length == 0) {
            return false;
        }

        if (args[0].equalsIgnoreCase("enable") || args[0].equalsIgnoreCase("start")) {
            if (args.length != 1) {
                return false;
            }

            if (plugin.getConfig().getBoolean("enabled")) {
                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch is already enabled.");
            } else {
                plugin.getConfig().set("enabled", true);
                plugin.saveConfig();

                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch enabled.");
            }
        } else if (args[0].equalsIgnoreCase("disable") || args[0].equalsIgnoreCase("stop")) {
            if (args.length != 1) {
                return false;
            }

            if (plugin.getConfig().getBoolean("enabled")) {
                plugin.getConfig().set("enabled", false);
                plugin.saveConfig();

                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch disabled.");
            } else {
                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch is already disabled.");
            }
        } else if (args[0].equalsIgnoreCase("status")) {
            if (args.length != 1) {
                return false;
            }

            if (plugin.getConfig().getBoolean("enabled")) {
                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch: enabled (\"" + plugin.getConfig().getString("message") + "\").");
            } else {
                sender.sendMessage(ChatColor.GOLD + "Good-Zuesch: disabled (\"" + plugin.getConfig().getString("message") + "\").");
            }
        } else if (args[0].equalsIgnoreCase("message")) {
            if (args.length != 2) {
                return false;
            }

            plugin.getConfig().set("message",args[1]);
            plugin.saveConfig();

            sender.sendMessage(ChatColor.GOLD + "Good-Zuesch message set to \"" + args[1] + "\"");
        } else if (args[0].equalsIgnoreCase("reset")) {
            if (args.length != 1) {
                return false;
            }

            File configFile = new File(plugin.getDataFolder(), "config.yml");

            configFile.delete();
            plugin.saveDefaultConfig();
            plugin.reloadConfig();
            plugin.getServer().getPluginManager().disablePlugin(plugin);
            plugin.getServer().getPluginManager().enablePlugin(plugin);

            sender.sendMessage(ChatColor.GOLD + "Good-Zuesch settings were reset.");
        } else {
            return false;
        }

        return true;
    }
}
