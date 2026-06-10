package  com.foxblack.nativemusicplayer

import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin
import org.godotengine.godot.plugin.UsedByGodot

class NativeMusicPlayer(
    godot: Godot
) : GodotPlugin(godot) {

    override fun getPluginMethods():
    MutableList<String> {
        return mutableListOf(
            "ping",
            "version"
        )
    }        
    
    override fun getPluginName(): String {
        return "NativeMusicPlayer"
    }
    
    @UsedByGodot
    fun ping(): String {
        return "pong"
    }

    @UsedByGodot
    fun version(): String {
        return "0.0.1"
    }    
}    
