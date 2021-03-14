package com.mikelax7.donhack;

import com.mikelax7.donhack.util.command.Command;
import com.mikelax7.donhack.util.command.CommandGlobal;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 2 lazy to import static
 */
public interface Globals {
  
  Logger LOGGER = LogManager.getLogger("DonHax");
  Minecraft MC = FMLClientHandler.instance().getClient();
  Command GLOBAL_COMMAND = CommandGlobal.getInstance();
}
