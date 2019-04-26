package net.runelite.client.plugins.MyMine;


import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.ObjectID;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.Notifier;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.hunter.HunterTrap;
import net.runelite.client.ui.overlay.OverlayManager;
import java.util.Iterator;
import java.util.Map;

@PluginDescriptor(
        name = "MyMine",
        description = "Make mining more efficient",
        tags = {"overlay", "skilling", "timers"}
)

public class Mine extends plugin{

    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private Notifier notifier;

    public void OnTick(GameTick tick, boolean mode){
        while(mode)
        {
            Iterator<Map.Entry<WorldPoint, Player.pos>> it = mines.entrySet().iterator();
            Tile[][][] tiles = client.getScene().getTiles();

            Map.Entry<WorldPoint, Player.pos> NextMine = it.next();
            WorldPoint world = entry.getKey();
            LocalPoint local = LocalPoint.fromWorld(client, world);

            //every tick, iterate through closest mines
            //check avalibility
            //if open, queue for next mine
            //on mine finish, highlight next rock (bright color)
        }
    }

}
