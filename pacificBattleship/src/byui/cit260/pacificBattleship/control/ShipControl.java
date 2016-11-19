/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.AircraftCarrierClassList;
import byui.cit260.pacificBattleship.model.BattleshipClassList;
import byui.cit260.pacificBattleship.model.DestroyerClassList;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;
import byui.cit260.pacificBattleship.model.SubmarineClassList;
import byui.cit260.pacificBattleship.model.TransportClassList;

/**
 *
 * @author ort09
 */
public class ShipControl {
    
        public static Ship[] createShips() {
            ShipClass[] battleshipClasses = ShipClassControl.createBattleshipClasses(); 
        
        Ship[] ships = new Ship[ShipList.values().length];
        
        Ship battleship = new Ship();
        battleship.setShipName("USS Tennessee");
        battleship.setType("Battleship");
        battleship.setDefense(1);
        battleship.setAccuracy(80);
        battleship.setUserControl(true);
        battleship.setAttack(4);
        battleship.setHull(10);
        battleship.setMaxHull(10);
        battleship.setDescription("");
        battleship.setLocation(null);
        battleship.setShipClass(battleshipClasses[BattleshipClassList.battleship0.ordinal()]);
        battleship.setSymbol(battleship.getShipClass().getSymbol());
        ships[ShipList.battleship.ordinal()] = battleship;
        
        ShipClass[] transportClasses = ShipClassControl.createTransportClasses();

        Ship transport = new Ship();
        transport.setShipName("USS President Jackson");
        transport.setType("Transport");
        transport.setDefense(0);
        transport.setAccuracy(100);
        transport.setUserControl(false);
        transport.setAttack(10);
        transport.setHull(6);
        transport.setMaxHull(6);
        transport.setDescription("");
        transport.setLocation(null);
        transport.setShipClass(transportClasses[TransportClassList.transport0.ordinal()]);
        transport.setSymbol(transport.getShipClass().getSymbol());
        ships[ShipList.transport.ordinal()] = transport;
        
        ShipClass[] submarineClasses = ShipClassControl.createSubmarineClasses();
        
        Ship submarine = new Ship();
        submarine.setShipName("USS submarine name");
        submarine.setType("Submarine");
        submarine.setDefense(0);
        submarine.setAccuracy(70);
        submarine.setUserControl(false);
        submarine.setAttack(10);
        submarine.setHull(8);
        submarine.setMaxHull(8);
        submarine.setDescription("");
        submarine.setLocation(null);
        submarine.setShipClass(submarineClasses[SubmarineClassList.submarine0.ordinal()]);
        submarine.setSymbol(submarine.getShipClass().getSymbol());
        ships[ShipList.submarine.ordinal()] = submarine;
        
        ShipClass[] aircraftCarrierClasses = ShipClassControl.createAircraftCarrierClasses();
        
        Ship aircraftCarrier = new Ship();
        aircraftCarrier.setShipName("USS arircraft carrier");
        aircraftCarrier.setType("Aircraft Carrier");
        aircraftCarrier.setDefense(0);
        aircraftCarrier.setAccuracy(75);
        aircraftCarrier.setUserControl(false);
        aircraftCarrier.setAttack(10);
        aircraftCarrier.setHull(14);
        aircraftCarrier.setMaxHull(14);
        aircraftCarrier.setDescription("");
        aircraftCarrier.setLocation(null);
        aircraftCarrier.setShipClass(aircraftCarrierClasses[AircraftCarrierClassList.aircraftCarrier0.ordinal()]);
        aircraftCarrier.setSymbol(aircraftCarrier.getShipClass().getSymbol());
        ships[ShipList.aircraftCarrier.ordinal()] = aircraftCarrier;
        
        ShipClass[] destroyerClasses = ShipClassControl.createDestroyerClasses();
        
        Ship destroyer = new Ship();
        destroyer.setShipName("USS destroyer");
        destroyer.setType("Destroyer");
        destroyer.setDefense(0);
        destroyer.setAccuracy(60);
        destroyer.setUserControl(false);
        destroyer.setAttack(10);
        destroyer.setHull(12);
        destroyer.setMaxHull(12);
        destroyer.setDescription("");
        destroyer.setLocation(null);
        destroyer.setShipClass(destroyerClasses[DestroyerClassList.destroyer0.ordinal()]);
        destroyer.setSymbol(destroyer.getShipClass().getSymbol());
        ships[ShipList.destroyer.ordinal()] = destroyer;
        
        return ships;
    }
    
}