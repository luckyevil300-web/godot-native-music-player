package  com.foxblack.nativemusicplayer

import org.godotengine.godot.Godot
import org.godotengine.godot.plugin.GodotPlugin

class NativeMusicPlayer(
    godot: Godot
) : GodotPlugin(godot) {
    
    override fun getPluginName(): String {
        return "NativeMusicPlayer"
    }
}    
