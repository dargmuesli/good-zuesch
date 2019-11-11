[![build status](https://travis-ci.com/dargmuesli/good-zuesch.svg?branch=master)](https://travis-ci.com/dargmuesli/good-zuesch "build status")

# GoodZuesch
Writes "züsch" for a player in chat who goes to bed on a Minecraft server.

## Download
See [Releases](https://github.com/Dargmuesli/good-zuesch/releases "Releases").

## Installation
Just put the downloaded .jar into your `plugins` folder and `start` or `reload` your server!

## Why
On my Minecraft server every player writes "züsch" instead of "good night" in the chat while waiting for the other players to go to bed. Why? Because one player said "züsch" while waiting for another player to go to bed when the other player told him about some amazing thing he built that day in Minecraft. "züsch" originates from the Turkish "çüş" which means "whoa" in English or "oha" in German.
This plugin reduces the amount of work a player's brain has to do when it has to remember to write "züsch" in the chat.

## Commands
- `goodzuesch` - Commands for configuring a sleep message.
  - `/<command> [enable, start]` - enable Good-Zuesch.
  - `/<command> [disable, stop]` - disable Good-Zuesch.
  - `/<command> status` - displays the current plugin configuration.
  - `/<command> message <text>` - set the sleep message.
  - `/<command> reset` - resets this plugin's configuration.

## Default Settings
- `enabled: true`
- `message: züsch`
