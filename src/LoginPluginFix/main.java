package LoginPluginFix;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin implements Listener{


	public void onEnable() {
	    if (!new File(getDataFolder(), "config.yml").exists())
	    {
	      saveDefaultConfig();
	      reloadConfig();
	    }
	    getServer().getPluginManager().registerEvents(this,this);
	}
	
	public void onDisable(){

	}

	public void tp(Player player){
		player.teleport(new Location(Bukkit.getWorld(getConfig().getString("loginfox.world")),
       			getConfig().getDouble("loginfox.x"), getConfig().getDouble("loginfox.y"), getConfig().getDouble("loginfox.z")));
	}
	
	@EventHandler
	public void LoginFix(PlayerJoinEvent lf){
		
		World w1 = Bukkit.getServer().getWorld(lf.getPlayer().getWorld().getName());
		double x =  lf.getPlayer().getLocation().getX();
		double y =  lf.getPlayer().getLocation().getY();
		double z =  lf.getPlayer().getLocation().getZ();
		
		if(x>=0){
			if(x%1<0.3){
				if(w1.getBlockAt((int) x-1, (int) y, (int) z).getType() == Material.PORTAL){

			       	tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				    
				}
			}
			if(x%1>=0.3 && x%1<=0.7){
				if(w1.getBlockAt((int) x, (int) y, (int) z).getType() == Material.PORTAL){
					
					tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
			if(x%1>0.7){
				if(w1.getBlockAt((int) x+1, (int) y, (int) z).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
		}else{
			if(-1*(x%1)<0.3){
				if(w1.getBlockAt((int) x, (int) y, (int) z).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				} 
			}
		}
			if(-1*(x%1)>=0.3 && -1*(x%1)<=0.7){
				if(w1.getBlockAt((int) x-1, (int) y, (int) z).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				     
				}
			}
			if(-1*(x%1)>0.7){
				if(w1.getBlockAt((int) x-2, (int) y, (int) z).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}			
		
			
		if(z>=0){
			if(z%1<0.3){
				if(w1.getBlockAt((int) x, (int) y, (int) z-1).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
			if(z%1>=0.3 && z%1<=0.7){
				if(w1.getBlockAt((int) x, (int) y, (int) z).getType() == Material.PORTAL){
					
			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				     
				}
			}
			if(z%1>0.7){
				if(w1.getBlockAt((int) x, (int) y, (int) z+1).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
		}else{
			if(-1*(z%1)<0.3){
				if(w1.getBlockAt((int) x, (int) y, (int) z).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
			if(-1*(z%1)>=0.3 && -1*(z%1)<=0.7){
				if(w1.getBlockAt((int) x, (int) y, (int) z-1).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}
			if(-1*(z%1)>0.7){
				if(w1.getBlockAt((int) x, (int) y, (int) z-2).getType() == Material.PORTAL){

			        tp(lf.getPlayer());
			        lf.getPlayer().sendMessage(ChatColor.RED+"避免您卡在地獄門，將您傳送至新手村");
				      
				}
			}			
		}		
		
		
	}
}
