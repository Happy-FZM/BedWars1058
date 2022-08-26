package com.andrei1058.bedwars.dreamcloud;

import org.bukkit.entity.Player;

public class Utils {


    /**
     * 获取玩家称号
     *
     * @param player 玩家
     * @return 玩家称号
     */
    public static String getPlayerRank(Player player) {
        if (player.hasPermission("hub.admin")) {
            return "§8[§c管理员§8] ";
        } else if (player.hasPermission("hub.huya")) {
            return "§8[§6虎牙主播§8] ";
        } else if (player.hasPermission("hub.douyu")) {
            return "§8[§6斗鱼主播§8] ";
        } else if (player.hasPermission("hub.cc")) {
            return "§8[§9CC主播§8] ";
        } else if (player.hasPermission("hub.bilibili")) {
            return "§8[§bB站主播§8] ";
        } else if (player.hasPermission("hub.mvpplus")) {
            return "§8[§cMVP+§8] ";
        } else if (player.hasPermission("hub.mvp")) {
            return "§8[§cMVP§8] ";
        } else if (player.hasPermission("hub.vipplus")) {
            return "§8[§9VIP+§8] ";
        } else if (player.hasPermission("hub.vip")) {
            return "§8[§9VIP§8] ";
        }
        return "";
    }
}
