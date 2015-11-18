/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Color;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Rishika Idnani
 */
public class Drone {

    private Node sourceNode;
    private Node destinationNode;
    private HashMap<String, Node> globalMap;
    private Node currentNode;
    private Node previousNode;
    private float fuel;
    private ArrayList<Node> pathFromSourceToDestination;
    private ArrayList<Node> pathFromOriginalSourceToDestination;
    private ConfidenceFactor cfFromSourceToDestination;
    private ConfidenceFactor cfFromOriginalSourceToDestination;
    private ConfidenceFactor confidenceFactor;

    public ConfidenceFactor getCfFromSourceToDestination() {
        return cfFromSourceToDestination;
    }

    public void setCfFromSourceToDestination(ConfidenceFactor cfFromSourceToDestination) {
        this.cfFromSourceToDestination = cfFromSourceToDestination;
    }

    public ConfidenceFactor getCfFromOriginalSourceToDestination() {
        return cfFromOriginalSourceToDestination;
    }

    public void setCfFromOriginalSourceToDestination(ConfidenceFactor cfFromOriginalSourceToDestination) {
        this.cfFromOriginalSourceToDestination = cfFromOriginalSourceToDestination;
    }

    public ArrayList<Node> getPathFromOriginalSourceToDestination() {
        return pathFromOriginalSourceToDestination;
    }

    public void setPathFromOriginalSourceToDestination(ArrayList<Node> pathFromOriginalSourceToDestination) {
        this.pathFromOriginalSourceToDestination = pathFromOriginalSourceToDestination;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public Drone(HashMap<String, Node> globalMap) {
        this.globalMap = globalMap;
        this.pathFromSourceToDestination = new ArrayList<>();
        this.pathFromOriginalSourceToDestination = new ArrayList<>();
        this.cfFromSourceToDestination = new ConfidenceFactor();
        this.cfFromOriginalSourceToDestination = new ConfidenceFactor();
        cfFromSourceToDestination.setPathFromSourceToDestination(pathFromSourceToDestination);
        cfFromOriginalSourceToDestination.setPathFromSourceToDestination(pathFromOriginalSourceToDestination);
        cfFromSourceToDestination.setNumberOfTimesPathTaken(1);
        cfFromOriginalSourceToDestination.setNumberOfTimesPathTaken(0);
    }

    public Node getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(Node sourceNode) {
        this.sourceNode = sourceNode;
    }

    public Node getDestinationNode() {
        return destinationNode;
    }

    public void setDestinationNode(Node destinationNode) {
        this.destinationNode = destinationNode;
    }

    public HashMap<String, Node> getGlobalMap() {
        return globalMap;
    }

    public void setGlobalMap(HashMap<String, Node> globalMap) {
        this.globalMap = globalMap;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    public ArrayList<Node> getAdjacentNodes(Node node) {
        ArrayList<Node> listOfAdjacentNode = new ArrayList<Node>();
        Utility utility = new Utility();
        String xName = node.getxName();
        String yName = node.getyName();
        String nodeName = xName + yName;

        int xNumber = utility.wordsToNumber(xName);
        int yNumber = utility.wordsToNumber(yName);
        int adjacentXNumber;
        int adjacentYNumber;
        String adjacentXName;
        String adjacentYName;
        String adjacentNodeName;

        //CASE 1 : Source Node
        if (xNumber == 0 && yNumber == 0) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            return listOfAdjacentNode;

        } //CASE 2: Destination Node
        else if (xNumber == 19 && yNumber == 19) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            return listOfAdjacentNode;
        } //CASE 3: 
        else if (xNumber == 0 && yNumber == 19) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            return listOfAdjacentNode;
        } //CASE 4
        else if (xNumber == 19 && yNumber == 0) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            return listOfAdjacentNode;
        } //CASE 5:
        else if (xNumber == 0) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode4 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode4);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode5 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode5);

            return listOfAdjacentNode;
        } //CASE 6
        else if (xNumber == 19) {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode4 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode4);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode5 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode5);

            return listOfAdjacentNode;
        } //CASE 7
        else if (yNumber == 0) {
            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode4 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode4);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode5 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode5);

            return listOfAdjacentNode;
        } //CASE 8
        else if (yNumber == 19) {
            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode4 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode4);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode5 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode5);

            return listOfAdjacentNode;
        } //CASE 9
        else {
            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode1 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode1);

            adjacentXNumber = xNumber;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode2 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode2);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode3 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode3);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode4 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode4);

            adjacentXNumber = xNumber - 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode5 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode5);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode6 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode6);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber - 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode7 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode7);

            adjacentXNumber = xNumber + 1;
            adjacentYNumber = yNumber + 1;

            adjacentXName = utility.numberToWords(adjacentXNumber);
            adjacentYName = utility.numberToWords(adjacentYNumber);
            adjacentYName = adjacentYName.substring(0, 1).toUpperCase() + adjacentYName.substring(1);
            adjacentNodeName = adjacentXName + adjacentYName;
            Node adjacentNode8 = (Node) globalMap.get(adjacentNodeName);
            listOfAdjacentNode.add(adjacentNode8);
            return listOfAdjacentNode;
        }
    }

    public Node constructThePath() {
        boolean foundGreaterY = false;
        int currentX = new Utility().wordsToNumber(currentNode.getxName());
        int currentY = new Utility().wordsToNumber(currentNode.getyName());
        int tempX = 0;
        int tempY = 0;
        ArrayList<Node> listOfAdjacentNodes = getAdjacentNodes(currentNode);

        for (Node node : listOfAdjacentNodes) {
            if (node.isIsAnamolyPresent() == false) {
                int adjacentX = new Utility().wordsToNumber(node.getxName());
                int adjacentY = new Utility().wordsToNumber(node.getyName());

                if (adjacentX > currentX && adjacentY > currentY) {
                    tempX = adjacentX;
                    tempY = adjacentY;
                    break;
                }

                if (adjacentX > currentX && foundGreaterY == false) {
                    tempX = adjacentX;
                    tempY = adjacentY;
                }

                if (adjacentY > currentY) {
                    if (adjacentX >= tempX) {
                        tempX = adjacentX;
                        tempY = adjacentY;
                        foundGreaterY = true;
                    }
                }
            }
        }

        String xName = new Utility().numberToWords(tempX);
        String yName = new Utility().numberToWords(tempY);
        yName = yName.substring(0, 1).toUpperCase() + yName.substring(1);
        setPreviousNode(currentNode);
        Node currentNode = globalMap.get(xName + yName);
        if (previousNode == currentNode) {
            //Go back to form the path as all the forward paths were blocked
            for (Node node : listOfAdjacentNodes) {
                int adjacentX = new Utility().wordsToNumber(node.getxName());
                int adjacentY = new Utility().wordsToNumber(node.getyName());

                if (adjacentX < currentX) {
                    tempX = adjacentX;
                    tempY = adjacentY;
                }

                if (adjacentY < currentY) {
                    tempX = adjacentX;
                    tempY = adjacentY;
                }
            }
            xName = new Utility().numberToWords(tempX);
            yName = new Utility().numberToWords(tempY);
            yName = yName.substring(0, 1).toUpperCase() + yName.substring(1);
            currentNode = globalMap.get(xName + yName);
        }
        setCurrentNode(currentNode);
        previousNode.getLabel().setBackground(Color.blue);
        currentNode.getLabel().setBackground(Color.green);
        return currentNode;
    }

    public Node findNearestNodeToDestination() {
        int currentX = new Utility().wordsToNumber(currentNode.getxName());
        int currentY = new Utility().wordsToNumber(currentNode.getyName());
        int destinationX = new Utility().wordsToNumber(destinationNode.getxName());
        int destinationY = new Utility().wordsToNumber(destinationNode.getyName());
        double minimumDistanceToDestination = 100;
        Node nearestNode = null;

        ArrayList<Node> listOfAdjacentNodes = getAdjacentNodes(currentNode);

        for (Node node : listOfAdjacentNodes) {
            if (node.isIsHighIntensityAnamolyPresent() == false
                    && node.isIsLowIntensityAnamolyPresent() == false
                    && node.isIsAnamolyPresent() == false) {
                int adjacentX = new Utility().wordsToNumber(node.getxName());
                int adjacentY = new Utility().wordsToNumber(node.getyName());
                double distance = getDistance(destinationX, adjacentX, destinationY, adjacentY);
                if (minimumDistanceToDestination > distance) {
                    minimumDistanceToDestination = distance;
                    nearestNode = node;
                }
            }
        }
//        if (nearestNode.isIsLowIntensityAnamolyPresent() == true) {
//            fuel = fuel + 2;
//        } else {
//            fuel = fuel + 1;
//        }
        setPreviousNode(currentNode);
        setCurrentNode(nearestNode);
        previousNode.getLabel().setBackground(Color.blue);
        currentNode.getLabel().setBackground(Color.green);
        return nearestNode;
    }

    public double getDistance(int destinationX, int sourceX, int destinationY, int sourceY) {
        double x = Math.pow((destinationX - sourceX), 2);
        double y = Math.pow((destinationY - sourceY), 2);
        double distance = sqrt(x + y);
        return distance;
    }

    public ArrayList<Node> getPathFromSourceToDestination() {
        return pathFromSourceToDestination;
    }

    public void setPathFromSourceToDestination(ArrayList<Node> pathFromSourceToDestination) {
        this.pathFromSourceToDestination = pathFromSourceToDestination;
    }

    public void initialPath(HashMap<Node, LinkedList<ConfidenceFactor>> pathMap, LinkedList<ConfidenceFactor> listOfPath) {
        for (int i = 0; i < 20; i++) {
            String xName = new Utility().numberToWords(i);
            String yName = xName.substring(0, 1).toUpperCase() + xName.substring(1);
            String nodeName = xName + yName;
            Node node = globalMap.get(nodeName);
            pathFromSourceToDestination.add(node);
            pathFromOriginalSourceToDestination.add(node);
        }
        listOfPath.addLast(cfFromOriginalSourceToDestination);
        pathMap.put(sourceNode, listOfPath);
    }

    public ConfidenceFactor getConfidenceFactor() {
        return confidenceFactor;
    }

    public void setConfidenceFactor(ConfidenceFactor confidenceFactor) {
        this.confidenceFactor = confidenceFactor;
    }

}
