package cps;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Cps extends Mod{

    public Cps(){
        Log.info("mmm");
    }
    
    public final ContentList[] cpsContent = {
        new CpsBlocks()
    }
    
    @Override
    public void loadContent(){
        for(ContentList list : cpsContent){
            list.load();
        };
    }

}
