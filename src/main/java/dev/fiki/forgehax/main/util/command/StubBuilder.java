package dev.fiki.forgehax.main.util.command;

import dev.fiki.forgehax.main.util.command.callbacks.CallbackData;
import org.lwjgl.glfw.GLFW;

import java.util.function.Consumer;

/**
 * Created on 6/8/2017 by fr1kin
 */
public class StubBuilder extends BaseCommandBuilder<StubBuilder, CommandStub> {
  
  public StubBuilder kpressed(Consumer<CallbackData> consumer) {
    getCallbacks(CallbackType.KEY_PRESSED).add(consumer);
    return this;
  }
  
  public StubBuilder kdown(Consumer<CallbackData> consumer) {
    getCallbacks(CallbackType.KEY_DOWN).add(consumer);
    return this;
  }
  
  public StubBuilder bind(int keyCode) {
    return insert(CommandStub.KEYBIND, keyCode);
  }
  
  public StubBuilder bind() {
    return bind(0);
  }
  
  public StubBuilder nobind() {
    return bind(-1);
  }
  
  public StubBuilder bindOptions(boolean b) {
    return insert(CommandStub.KEYBIND_OPTIONS, b);
  }
  
  @Override
  public CommandStub build() {
    return new CommandStub(data);
  }
}