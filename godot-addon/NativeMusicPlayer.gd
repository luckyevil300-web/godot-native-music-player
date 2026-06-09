@tool
extends EditorPlugin

func _enter_tree():
 print("NativeMusicPlayer loaded")

func _exit_tree():
 print("NativeMusicPlayer unloaded")
