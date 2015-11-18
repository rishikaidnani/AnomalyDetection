/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rishika Idnani
 */
public class Graph {

    private HashMap<String, Node> globalMap;
    private Drone drone;
    private Utility utility;
    private JPanel gridJPanel;

    public Graph(JPanel gridJPanel) {
        this.gridJPanel = gridJPanel;
        this.globalMap = new HashMap<>();
        utility = new Utility();
        drone = new Drone(globalMap);
        configureTheNodes();
        mapNodesToHashMap();

    }

    public HashMap<String, Node> getGlobalMap() {
        return globalMap;
    }

    public void setGlobalMap(HashMap<String, Node> globalMap) {
        this.globalMap = globalMap;
    }

    public void configureTheNodes() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Node node = new Node();
                String xName = utility.numberToWords(i);
                node.setxName(xName);
                String yName = utility.numberToWords(j);
                yName = yName.substring(0, 1).toUpperCase() + yName.substring(1);
                node.setyName(yName);
                node.setNodeName();
                globalMap.put(node.getNodeName(), node);
                if (i == 0 && j == 0) {
                    drone.setSourceNode(node);
                    drone.setCurrentNode(node);
                }
                if (i == 19 && j == 19) {
                    drone.setDestinationNode(node);
                }
            }
        }
    }

    public void mapNodesToHashMap() {

        for (Component c : gridJPanel.getComponents()) {
            if (c instanceof JLabel) {
                JLabel label = (JLabel) c;
                String jlabelName = label.getName();
                if (jlabelName != null) {
                    Node node = globalMap.get(jlabelName);
                    if (node != null) {
                        node.setLabel((JLabel) c);
                    }
                }
            }
        }
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public Utility getUtility() {
        return utility;
    }

    public void setUtility(Utility utility) {
        this.utility = utility;
    }
}
