package cps;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import mindustry.ui.dialogs.*;
import cps.content.*;

public class Cps extends Mod{

    public Cps(){
        Log.info("mmm");
    }
    
    public final ContentList[] cpsContent = {
        new CpsBlocks()
    };
    
    @Override
    public void loadContent(){
        for(ContentList list : cpsContent){
            list.load();
        };
    }

}
