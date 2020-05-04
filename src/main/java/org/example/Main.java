package org.example;

import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.Listener;
import cn.nukkit.event.EventHandler;

public class Main extends PluginBase implements Listener{

    @Override
    public void onEnable() {
        super.onEnable();
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
         Player player = event.getPlayer();
         String Name = player.getName();
         String message = Name + "が宇宙にやってきました";
        event.setJoinMessage(message);
         player.sendMessage("ようこそ！宇宙サーバーへ");
    }
}
