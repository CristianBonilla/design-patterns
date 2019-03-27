package com.patterns.command;

import java.util.List;
// import java.util.ArrayList;
import static java.util.Arrays.asList;

// client
public class CommandDemo {

  public static void main(String[] args) {
    Light bedroomlight = new Light();
    Light kitchenlight = new Light();
    Switch lightSwitch = new Switch();
    
    // Command onCommand = new OnCommand(bedroomlight);
    // lightSwitch.storeAndExecute(onCommand);

    Command toggleCommand = new ToggleCommand(bedroomlight);    
    lightSwitch.storeAndExecute(toggleCommand);
    // lightSwitch.storeAndExecute(toggleCommand);
    // lightSwitch.storeAndExecute(toggleCommand);
    
    // List<Light> lights = new ArrayList<>();
    // lights.add(bedroomlight);
    // lights.add(kitchenlight);
    
    // List<Light> lights = new ArrayList<Light>() {{
    //   add(bedroomlight);
    //   add(kitchenlight);
    // }};
    
    List<Light> lights = asList(bedroomlight, kitchenlight);
    Command allLightsCommand = new AllLightsCommand(lights);
    
    lightSwitch.storeAndExecute(allLightsCommand);
  }
}
