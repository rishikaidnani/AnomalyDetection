/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.ConfidenceFactor;
import Business.Drone;
import Business.Graph;
import Business.Node;
import Business.Utility;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Rishika Idnani
 */
public class MainJFrame extends javax.swing.JFrame {

    private Graph graph;
    private int restrictTimer;
    private Timer timer;
    private HashMap<Node, LinkedList<ConfidenceFactor>> pathMap;
    private int currentIndexOfTheNode = 1;
    private boolean machineIsLearning = false;
    private boolean flag = false;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        initComponents();
        settingLabelNames();
        graph = new Graph(gridJPanel);
        pathMap = new HashMap<>();
        LinkedList<ConfidenceFactor> listOfPaths = new LinkedList<>();
        graph.getDrone().initialPath(pathMap, listOfPaths);
        timerProcessingJButton.setVisible(false);
        timer = new Timer(1000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerProcessingJButtonActionPerformed(evt);
            }
        });
    }

    public void settingLabelNames() {
        zeroZero.setName("zeroZero");
        oneZero.setName("oneZero");
        twoZero.setName("twoZero");
        threeZero.setName("threeZero");
        fourZero.setName("fourZero");
        fiveZero.setName("fiveZero");
        sixZero.setName("sixZero");
        zeroOne.setName("zeroOne");
        oneOne.setName("oneOne");
        twoOne.setName("twoOne");
        threeOne.setName("threeOne");
        fourOne.setName("fourOne");
        fiveOne.setName("fiveOne");
        sixOne.setName("sixOne");
        zeroTwo.setName("zeroTwo");
        oneTwo.setName("oneTwo");
        twoTwo.setName("twoTwo");
        threeTwo.setName("threeTwo");
        fourTwo.setName("fourTwo");
        fiveTwo.setName("fiveTwo");
        sixTwo.setName("sixTwo");
        zeroThree.setName("zeroThree");
        oneThree.setName("oneThree");
        twoThree.setName("twoThree");
        threeThree.setName("threeThree");
        fourThree.setName("fourThree");
        fiveThree.setName("fiveThree");
        sixThree.setName("sixThree");
        zeroFour.setName("zeroFour");
        oneFour.setName("oneFour");
        twoFour.setName("twoFour");
        threeFour.setName("threeFour");
        fourFour.setName("fourFour");
        fiveFour.setName("fiveFour");
        sixFour.setName("sixFour");
        zeroFive.setName("zeroFive");
        oneFive.setName("oneFive");
        twoFive.setName("twoFive");
        threeFive.setName("threeFive");
        fourFive.setName("fourFive");
        fiveFive.setName("fiveFive");
        sixFive.setName("sixFive");
        zeroSix.setName("zeroSix");
        oneSix.setName("oneSix");
        twoSix.setName("twoSix");
        threeSix.setName("threeSix");
        fourSix.setName("fourSix");
        fiveSix.setName("fiveSix");
        sixSix.setName("sixSix");
        sevenZero.setName("sevenZero");
        eightZero.setName("eightZero");
        nineZero.setName("nineZero");
        tenZero.setName("tenZero");
        elevenZero.setName("elevenZero");
        twelveZero.setName("twelveZero");
        thirteenZero.setName("thirteenZero");
        thirteenOne.setName("thirteenOne");
        twelveOne.setName("twelveOne");
        elevenOne.setName("elevenOne");
        tenOne.setName("tenOne");
        nineOne.setName("nineOne");
        eightOne.setName("eightOne");
        sevenOne.setName("sevenOne");
        sevenTwo.setName("sevenTwo");
        sevenThree.setName("sevenThree");
        sevenFour.setName("sevenFour");
        sevenFive.setName("sevenFive");
        sevenSix.setName("sevenSix");
        eightSix.setName("eightSix");
        eightFive.setName("eightFive");
        eightFour.setName("eightFour");
        eightThree.setName("eightThree");
        eightTwo.setName("eightTwo");
        nineTwo.setName("nineTwo");
        tenTwo.setName("tenTwo");
        elevenTwo.setName("elevenTwo");
        twelveTwo.setName("twelveTwo");
        thirteenTwo.setName("thirteenTwo");
        thirteenThree.setName("thirteenThree");
        twelveThree.setName("twelveThree");
        elevenThree.setName("elevenThree");
        tenThree.setName("tenThree");
        nineThree.setName("nineThree");
        nineFour.setName("nineFour");
        tenFour.setName("tenFour");
        elevenFour.setName("elevenFour");
        twelveFour.setName("twelveFour");
        thirteenFour.setName("thirteenFour");
        thirteenFive.setName("thirteenFive");
        nineFive.setName("nineFive");
        tenFive.setName("tenFive");
        elevenFive.setName("elevenFive");
        twelveFive.setName("twelveFive");
        twelveSix.setName("twelveSix");
        elevenSix.setName("elevenSix");
        tenSix.setName("tenSix");
        nineSix.setName("nineSix");
        thirteenSix.setName("thirteenSix");
        fourteenZero.setName("fourteenZero");
        fiveteenZero.setName("fiveteenZero");
        sixteenZero.setName("sixteenZero");
        seventeenZero.setName("seventeenZero");
        eighteenZero.setName("eighteenZero");;
        nineteenZero.setName("nineteenZero");
        nineteenOne.setName("nineteenOne");
        eighteenOne.setName("eighteenOne");
        seventeenOne.setName("seventeenOne");
        sixteenOne.setName("sixteenOne");
        fiveteenOne.setName("fiveteenOne");
        fourteenOne.setName("fourteenOne");
        fourteenTwo.setName("fourteenTwo");
        fourteenThree.setName("fourteenThree");
        fourteenFour.setName("fourteenFour");
        fourteenFive.setName("fourteenFive");
        fourteenSix.setName("fourteenSix");
        fiveteenSix.setName("fiveteenSix");
        fiveteenFive.setName("fiveteenFive");
        fiveteenFour.setName("fiveteenFour");
        fiveteenThree.setName("fiveteenThree");
        fiveteenTwo.setName("fiveteenTwo");
        sixteenTwo.setName("sixteenTwo");
        seventeenTwo.setName("seventeenTwo");
        eighteenTwo.setName("eighteenTwo");
        nineteenTwo.setName("ninteenTwo");
        nineteenThree.setName("nineteenThree");
        eighteenThree.setName("eighteenThree");
        seventeenThree.setName("seventeenThree");
        sixteenThree.setName("sixteenThree");
        sixteenFour.setName("sixteenFour");
        seventeenFour.setName("seventeenFour");
        eighteenFour.setName("eighteenFour");
        nineteenFour.setName("nineteenFour");
        sixteenFive.setName("sixteenFive");
        seventeenFive.setName("seventeenFive");
        eighteenFive.setName("eighteenFive");
        nineteenFive.setName("nineteenFive");
        nineteenSix.setName("nineteenSix");
        eighteenSix.setName("eighteenSix");
        seventeenSix.setName("seventeenSix");
        sixteenSix.setName("sixteenSix");
        zeroSeven.setName("zeroSeven");
        oneSeven.setName("oneSeven");
        twoSeven.setName("twoSeven");
        threeSeven.setName("threeSeven");
        fourSeven.setName("fourSeven");
        fiveSeven.setName("fiveSeven");
        sixSeven.setName("sixSeven");
        sixEight.setName("sixEight");
        fiveEight.setName("fiveEight");
        fourEight.setName("fourEight");
        threeEight.setName("threeEight");
        twoEight.setName("twoEight");
        oneEight.setName("oneEight");
        zeroEight.setName("zeroEight");
        zeroNine.setName("zeroNine");
        zeroTen.setName("zeroTen");
        zeroEleven.setName("zeroEleven");
        zeroTwelve.setName("zeroTwelve");
        zeroThirteen.setName("zeroThirteen");
        oneThirteen.setName("oneThirteen");
        oneTwelve.setName("oneTwelve");
        oneEleven.setName("oneEleven");
        oneTen.setName("oneTen");
        oneNine.setName("oneNine");
        twoNine.setName("twoNine");
        threeNine.setName("threeNine");
        fourNine.setName("fourNine");
        fiveNine.setName("fiveNine");
        sixNine.setName("sixNine");
        sixTen.setName("sixTen");
        fiveTen.setName("fiveTen");
        fourTen.setName("fourTen");
        threeTen.setName("threeTen");
        twoTen.setName("twoTen");
        twoEleven.setName("twoEleven");
        threeEleven.setName("threeEleven");
        fourEleven.setName("fourEleven");
        fiveEleven.setName("fiveEleven");
        sixEleven.setName("sixEleven");
        sixTwelve.setName("sixTwelve");
        twoTwelve.setName("twoTwelve");
        threeTwelve.setName("threeTwelve");
        fourTwelve.setName("fourTwelve");
        fiveTwelve.setName("fiveTwelve");
        fiveThirteen.setName("fiveThirteen");
        fourThirteen.setName("fourThirteen");
        threeThirteen.setName("threeThirteen");
        sixThirteen.setName("sixThirteen");
        sevenSeven.setName("sevenSeven");
        eightSeven.setName("eightSeven");
        nineSeven.setName("nineSeven");
        tenSeven.setName("tenSeven");
        elevenSeven.setName("elevenSeven");
        twelveSeven.setName("twelveSeven");
        thirteenSeven.setName("thirteenSeven");
        twelveEight.setName("twelveEight");
        elevenEight.setName("elevenEight");
        tenEight.setName("tenEight");
        nineEight.setName("nineEight");
        eightEight.setName("eightEight");
        sevenEight.setName("sevenEight");
        sevenNine.setName("sevenNine");
        sevenTen.setName("sevenTen");
        sevenEleven.setName("sevenEleven");
        sevenTwelve.setName("sevenTwelve");
        sevenThirteen.setName("sevenThirteen");
        eightThirteen.setName("eightThirteen");
        eightTwelve.setName("eightTwelve");
        eightEleven.setName("eightEleven");
        eightTen.setName("eightTen");
        eightNine.setName("eightNine");
        nineNine.setName("nineNine");
        tenNine.setName("tenNine");
        elevenNine.setName("elevenNine");
        twelveNine.setName("twelveNine");
        thirteenNine.setName("thirteenNine");
        thirteenTen.setName("thirteenTen");
        twelveTen.setName("twelveTen");
        elevenTen.setName("elevenTen");
        tenTen.setName("tenTen");
        nineTen.setName("nineTen");
        nineEleven.setName("nineEleven");
        tenEleven.setName("tenEleven");
        elevenEleven.setName("elevenEleven");
        twelveEleven.setName("twelveEleven");
        thirteenEleven.setName("thirteenEleven");
        thirteenTwelve.setName("thirteenTwelve");
        nineTwelve.setName("nineTwelve");
        tenTwelve.setName("tenTwelve");
        elevenTwelve.setName("elevenTwelve");
        twelveTwelve.setName("twelveTwelve");
        twelveThirteen.setName("twelveThirteen");
        elevenThirteen.setName("elevenThirteen");
        tenThirteen.setName("tenThirteen");
        nineThirteen.setName("nineThirteen");
        thirteenThirteen.setName("thirteenThirteen");
        fourteenSeven.setName("fourteenSeven");
        fiveteenSeven.setName("fiveteenSeven");
        sixteenSeven.setName("sixteenSeven");
        seventeenSeven.setName("seventeenSeven");
        eighteenSeven.setName("eighteenSeven");
        nineteenSeven.setName("nineteenSeven");
        nineteenEight.setName("nineteenEight");
        eighteenEight.setName("eighteenEight");
        seventeenEight.setName("seventeenEight");
        sixteenEight.setName("sixteenEight");
        fiveteenEight.setName("fiveteenEight");
        fourteenNine.setName("fourteenNine");
        fourteenTen.setName("fourteenTen");
        fourteenEleven.setName("fourteenEleven");
        fourteenTwelve.setName("fourteenTwelve");
        fourteenThirteen.setName("fourteenThirteen");
        fiveteenThirteen.setName("fiveteenThirteen");
        fiveteenTwelve.setName("fiveteenTwelve");
        fiveteenEleven.setName("fiveteenEleven");
        fiveteenTen.setName("fiveteenTen");
        fiveteenNine.setName("fiveteenNine");
        sixteenNine.setName("sixteenNine");
        seventeenNine.setName("seventeenNine");
        eighteenNine.setName("eighteenNine");
        nineteenNine.setName("nineteenNine");
        nineteenTen.setName("nineteenTen");
        eighteenTen.setName("eighteenTen");
        seventeenTen.setName("seventeenTen");
        sixteenTen.setName("sixteenTen");
        sixteenEleven.setName("sixteenEleven");
        seventeenEleven.setName("seventeenEleven");
        eighteenEleven.setName("eighteenEleven");
        nineteenEleven.setName("nineteenEleven");
        sixteenTwelve.setName("sixteenTwelve");
        seventeenTwelve.setName("seventeenTwelve");
        eighteenTwelve.setName("eighteenTwelve");
        nineteenTwelve.setName("nineteenTwelve");
        nineteenThirteen.setName("nineteenThirteen");
        eighteenThirteen.setName("eighteenThirteen");
        seventeenThirteen.setName("seventeenThirteen");
        sixteenThirteen.setName("sixteenThirteen");
        zeroFourteen.setName("zeroFourteen");
        oneFourteen.setName("oneFourteen");
        twoFourteen.setName("twoFourteen");
        threeFourteen.setName("threeFourteen");
        fourFourteen.setName("fourFourteen");
        fiveFourteen.setName("fiveFourteen");
        sixFourteen.setName("sixFourteen");
        sixFiveteen.setName("sixFiveteen");
        fiveFiveteen.setName("fiveFiveteen");
        fourFiveteen.setName("fourFiveteen");
        threeFiveteen.setName("threeFiveteen");
        twoFiveteen.setName("twoFiveteen");
        oneFiveteen.setName("oneFiveteen");
        zeroFiveteen.setName("zeroFiveteen");
        zeroSixteen.setName("zeroSixteen");
        zeroSeventeen.setName("zeroSeventeen");
        zeroEighteen.setName("zeroEighteen");
        zeroNineteen.setName("zeroNineteen");
        oneNineteen.setName("oneNineteen");
        oneEighteen.setName("oneEighteen");
        oneSeventeen.setName("oneSeventeen");
        oneSixteen.setName("oneSixteen");
        twoSixteen.setName("twoSixteen");
        threeSixteen.setName("threeSixteen");
        fourSixteen.setName("fourSixteen");
        fiveSixteen.setName("fiveSixteen");
        sixSixteen.setName("sixSixteen");
        sixSeventeen.setName("sixSeventeen");
        fiveSeventeen.setName("fiveSeventeen");
        fourSeventeen.setName("fourSeventeen");
        threeSeventeen.setName("threeSeventeen");
        twoSeventeen.setName("twoSeventeen");
        twoEighteen.setName("twoEighteen");
        threeEighteen.setName("threeEighteen");
        fourEighteen.setName("fourEighteen");
        fiveEighteen.setName("fiveEighteen");
        sixEighteen.setName("sixEighteen");
        sixNineteen.setName("sixNineteen");
        twoNineteen.setName("twoNineteen");
        threeNineteen.setName("threeNineteen");
        fourNineteen.setName("fourNineteen");
        fiveNineteen.setName("fiveNineteen");
        thirteenNineteen.setName("thirteenNineteen");
        twelveEighteen.setName("twelveEighteen");
        nineSeventeen.setName("nineSeventeen");
        eightNineteen.setName("eightNineteen");
        eightFiveteen.setName("eightFiveteen");
        elevenNineteen.setName("elevenNineteen");
        tenSeventeen.setName("tenSeventeen");
        twelveNineteen.setName("twelveNineteen");
        thirteenFourteen.setName("thirteenFourteen");
        thirteenSixteen.setName("thirteenSixteen");
        nineSixteen.setName("nineSixteen");
        thirteenSeventeen.setName("thirteenSeventeen");
        twelveFourteen.setName("twelveFourteen");
        twelveFiveteen.setName("twelveFiveteen");
        twelveSixteen.setName("twelveSixteen");
        sevenNineteen.setName("sevenNineteen");
        sevenFiveteen.setName("sevenFiveteen");
        elevenFourteen.setName("elevenFourteen");
        tenFiveteen.setName("tenFiveteen");
        eightFourteen.setName("eightFourteen");
        eighEighteen.setName("eighEighteen");
        tenNineteen.setName("tenNineteen");
        elevenEighteen.setName("elevenEighteen");
        nineFiveteen.setName("nineFiveteen");
        nineNineteen.setName("nineNineteen");
        eightSeventeen.setName("eightSeventeen");
        elevenSeventeen.setName("elevenSeventeen");
        elevenFiveteen.setName("elevenFiveteen");
        eightSixteen.setName("eightSixteen");
        sevenEighteen.setName("sevenEighteen");
        thirteenEighteen.setName("thirteenEighteen");
        tenFourteen.setName("tenFourteen");
        sevenSixteen.setName("sevenSixteen");
        sevenSeventeen.setName("sevenSeventeen");
        twelveSeventeen.setName("twelveSeventeen");
        elevenSixteen.setName("elevenSixteen");
        nineEighteen.setName("nineEighteen");
        sevenFourteen.setName("sevenFourteen");
        nineFourteen.setName("nineFourteen");
        thirteenFiveteen.setName("thirteenFiveteen");
        tenEighteen.setName("tenEighteen");
        tenSixteen.setName("tenSixteen");
        nineteenEighteen.setName("nineteenEighteen");
        sixteenSeventeen.setName("sixteenSeventeen");
        fiveteenNineteen.setName("fiveteenNineteen");
        fiveteenFiveteen.setName("fiveteenFiveteen");
        eighteenNineteen.setName("eighteenNineteen");
        seventeenSeventeen.setName("seventeenSeventeen");
        nineteenNineteen.setName("nineteenNineteen");
        sixteenSixteen.setName("sixteenSixteen");
        nineteenFourteen.setName("nineteenFourteen");
        nineteenFiveteen.setName("nineteenFiveteen");
        nineteenSixteen.setName("nineteenSixteen");
        fourteenNineteen.setName("fourteenNineteen");
        fourteenFiveteen.setName("fourteenFiveteen");
        eighteenFourteen.setName("eighteenFourteen");
        seventeenFiveteen.setName("seventeenFiveteen");
        fiveteenEighteen.setName("fiveteenEighteen");
        seventeenNineteen.setName("seventeenNineteen");
        eighteenEighteen.setName("eighteenEighteen");
        sixteenFiveteen.setName("sixteenFiveteen");
        sixteenNineteen.setName("sixteenNineteen");
        fiveteenSeventeen.setName("fiveteenSeventeen");
        eighteenSeventeen.setName("eighteenSeventeen");
        eighteenFiveteen.setName("eighteenFiveteen");
        fiveteenSixteen.setName("fiveteenSixteen");
        fourteenEighteen.setName("fourteenEighteen");
        seventeenFourteen.setName("seventeenFourteen");
        fourteenSixteen.setName("fourteenSixteen");
        fourteenSeventeen.setName("fourteenSeventeen");
        nineteenSeventeen.setName("nineteenSeventeen");
        eighteenSixteen.setName("eighteenSixteen");
        sixteenEighteen.setName("sixteenEighteen");
        fourteenFourteen.setName("fourteenFourteen");
        sixteenFourteen.setName("sixteenFourteen");
        seventeenEighteen.setName("seventeenEighteen");
        seventeenSixteen.setName("seventeenSixteen");
        fiveteenFourteen.setName("fiveteenFourteen");
    }

    public void resetAnamolies(HashMap<String, Node> globalMap) {
        for (Node node : globalMap.values()) {
            node.setIsAnamolyPresent(false);
            node.setIsHighIntensityAnamolyPresent(false);
            node.setIsLowIntensityAnamolyPresent(false);
        }

        for (Component c : gridJPanel.getComponents()) {
            if (c instanceof JLabel) {
                Color color = c.getBackground();
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                if (red == 255 && green == 0 && blue == 0) {
                    c.setBackground(Color.white);
                }
            }
        }
    }

    public void createAnamolies(HashMap<String, Node> globalMap) {
        Random random = new Random();
        int numberOfNodesToAddAnamoly = random.nextInt(200);
        for (int i = 0; i <= numberOfNodesToAddAnamoly; i++) {
            int xNumber = random.nextInt(19);
            int yNumber = random.nextInt(19);
            String xName = new Utility().numberToWords(xNumber);
            String yName = new Utility().numberToWords(yNumber);
            yName = yName.substring(0, 1).toUpperCase() + yName.substring(1);
            String anamolyKey = xName + yName;
            Node node = graph.getGlobalMap().get(anamolyKey);
            if ((xNumber + yNumber) % 2 == 0) {
                node.setIsAnamolyPresent(true);
                node.setIsHighIntensityAnamolyPresent(true);
            } else {
                node.setIsAnamolyPresent(true);
                node.setIsLowIntensityAnamolyPresent(true);
            }

            JLabel label = node.getLabel();

            if (label != null) {
                if (label.getBackground().getRed() == 0 && label.getBackground().getGreen() == 0 && label.getBackground().getBlue() == 255) {
                    label.setBackground(Color.blue);
                } else {
                    label.setBackground(Color.red);
                }
            }
        }
    }

    public void createAnamolyAtOneOne() {
        int xNumber1 = 1;
        int yNumber1 = 1;
        String xName1 = new Utility().numberToWords(xNumber1);
        String yName1 = new Utility().numberToWords(yNumber1);
        yName1 = yName1.substring(0, 1).toUpperCase() + yName1.substring(1);
        String anamolyKey1 = xName1 + yName1;
        if (anamolyKey1.equalsIgnoreCase("oneone")) {
            Node node1 = graph.getGlobalMap().get(anamolyKey1);
            node1.setIsAnamolyPresent(true);
            node1.setIsHighIntensityAnamolyPresent(true);
//            node.setIsLowIntensityAnamolyPresent(true);
            JLabel label1 = node1.getLabel();
            if (label1 != null) {
                if (label1.getBackground().getRed() == 0 && label1.getBackground().getGreen() == 0 && label1.getBackground().getBlue() == 255) {
                    label1.setBackground(Color.blue);
                } else {
                    label1.setBackground(Color.red);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridJPanel = new javax.swing.JPanel();
        zeroZero = new javax.swing.JLabel();
        oneTwo = new javax.swing.JLabel();
        oneZero = new javax.swing.JLabel();
        twoZero = new javax.swing.JLabel();
        threeZero = new javax.swing.JLabel();
        fourZero = new javax.swing.JLabel();
        fiveZero = new javax.swing.JLabel();
        sixZero = new javax.swing.JLabel();
        sevenZero = new javax.swing.JLabel();
        eightZero = new javax.swing.JLabel();
        nineZero = new javax.swing.JLabel();
        nineOne = new javax.swing.JLabel();
        eightOne = new javax.swing.JLabel();
        sevenOne = new javax.swing.JLabel();
        sixOne = new javax.swing.JLabel();
        fiveOne = new javax.swing.JLabel();
        fourOne = new javax.swing.JLabel();
        threeOne = new javax.swing.JLabel();
        twoOne = new javax.swing.JLabel();
        zeroOne = new javax.swing.JLabel();
        oneOne = new javax.swing.JLabel();
        twoTwo = new javax.swing.JLabel();
        zeroTwo = new javax.swing.JLabel();
        zeroThree = new javax.swing.JLabel();
        zeroFour = new javax.swing.JLabel();
        zeroFive = new javax.swing.JLabel();
        zeroSix = new javax.swing.JLabel();
        zeroSeven = new javax.swing.JLabel();
        oneSeven = new javax.swing.JLabel();
        oneThree = new javax.swing.JLabel();
        twoThree = new javax.swing.JLabel();
        threeThree = new javax.swing.JLabel();
        fourThree = new javax.swing.JLabel();
        fiveThree = new javax.swing.JLabel();
        sixThree = new javax.swing.JLabel();
        sevenThree = new javax.swing.JLabel();
        eightThree = new javax.swing.JLabel();
        nineThree = new javax.swing.JLabel();
        nineTwo = new javax.swing.JLabel();
        eightTwo = new javax.swing.JLabel();
        sevenTwo = new javax.swing.JLabel();
        sixTwo = new javax.swing.JLabel();
        fiveTwo = new javax.swing.JLabel();
        fourTwo = new javax.swing.JLabel();
        threeTwo = new javax.swing.JLabel();
        twoFour = new javax.swing.JLabel();
        oneFour = new javax.swing.JLabel();
        threeFour = new javax.swing.JLabel();
        fourFour = new javax.swing.JLabel();
        fiveFour = new javax.swing.JLabel();
        sixFour = new javax.swing.JLabel();
        sevenFour = new javax.swing.JLabel();
        eightFour = new javax.swing.JLabel();
        nineFour = new javax.swing.JLabel();
        nineFive = new javax.swing.JLabel();
        eightFive = new javax.swing.JLabel();
        sevenFive = new javax.swing.JLabel();
        sixFive = new javax.swing.JLabel();
        fiveFive = new javax.swing.JLabel();
        fourFive = new javax.swing.JLabel();
        threeFive = new javax.swing.JLabel();
        twoFive = new javax.swing.JLabel();
        oneFive = new javax.swing.JLabel();
        oneSix = new javax.swing.JLabel();
        twoSix = new javax.swing.JLabel();
        threeSix = new javax.swing.JLabel();
        fourSix = new javax.swing.JLabel();
        fiveSix = new javax.swing.JLabel();
        sixSix = new javax.swing.JLabel();
        sevenSix = new javax.swing.JLabel();
        eightSix = new javax.swing.JLabel();
        nineSix = new javax.swing.JLabel();
        nineSeven = new javax.swing.JLabel();
        eightSeven = new javax.swing.JLabel();
        sevenSeven = new javax.swing.JLabel();
        sixSeven = new javax.swing.JLabel();
        fiveSeven = new javax.swing.JLabel();
        fourSeven = new javax.swing.JLabel();
        threeSeven = new javax.swing.JLabel();
        twoSeven = new javax.swing.JLabel();
        zeroEight = new javax.swing.JLabel();
        oneEight = new javax.swing.JLabel();
        twoEight = new javax.swing.JLabel();
        threeEight = new javax.swing.JLabel();
        fourEight = new javax.swing.JLabel();
        fiveEight = new javax.swing.JLabel();
        sixEight = new javax.swing.JLabel();
        sevenEight = new javax.swing.JLabel();
        eightEight = new javax.swing.JLabel();
        nineEight = new javax.swing.JLabel();
        zeroNine = new javax.swing.JLabel();
        oneNine = new javax.swing.JLabel();
        twoNine = new javax.swing.JLabel();
        threeNine = new javax.swing.JLabel();
        fourNine = new javax.swing.JLabel();
        fiveNine = new javax.swing.JLabel();
        sixNine = new javax.swing.JLabel();
        sevenNine = new javax.swing.JLabel();
        eightNine = new javax.swing.JLabel();
        nineNine = new javax.swing.JLabel();
        nineTen = new javax.swing.JLabel();
        eightTen = new javax.swing.JLabel();
        sevenTen = new javax.swing.JLabel();
        sixTen = new javax.swing.JLabel();
        fiveTen = new javax.swing.JLabel();
        fourTen = new javax.swing.JLabel();
        threeTen = new javax.swing.JLabel();
        twoTen = new javax.swing.JLabel();
        oneTen = new javax.swing.JLabel();
        zeroTen = new javax.swing.JLabel();
        zeroEleven = new javax.swing.JLabel();
        oneEleven = new javax.swing.JLabel();
        twoEleven = new javax.swing.JLabel();
        threeEleven = new javax.swing.JLabel();
        fourEleven = new javax.swing.JLabel();
        fiveEleven = new javax.swing.JLabel();
        sixEleven = new javax.swing.JLabel();
        sevenEleven = new javax.swing.JLabel();
        eightEleven = new javax.swing.JLabel();
        nineEleven = new javax.swing.JLabel();
        nineTwelve = new javax.swing.JLabel();
        eightTwelve = new javax.swing.JLabel();
        sevenTwelve = new javax.swing.JLabel();
        sixTwelve = new javax.swing.JLabel();
        fiveTwelve = new javax.swing.JLabel();
        fourTwelve = new javax.swing.JLabel();
        threeTwelve = new javax.swing.JLabel();
        twoTwelve = new javax.swing.JLabel();
        oneTwelve = new javax.swing.JLabel();
        zeroTwelve = new javax.swing.JLabel();
        zeroThirteen = new javax.swing.JLabel();
        zeroFourteen = new javax.swing.JLabel();
        zeroFiveteen = new javax.swing.JLabel();
        oneThirteen = new javax.swing.JLabel();
        oneFourteen = new javax.swing.JLabel();
        oneFiveteen = new javax.swing.JLabel();
        twoThirteen = new javax.swing.JLabel();
        twoFourteen = new javax.swing.JLabel();
        twoFiveteen = new javax.swing.JLabel();
        threeThirteen = new javax.swing.JLabel();
        fourThirteen = new javax.swing.JLabel();
        fiveThirteen = new javax.swing.JLabel();
        sixThirteen = new javax.swing.JLabel();
        sevenThirteen = new javax.swing.JLabel();
        eightThirteen = new javax.swing.JLabel();
        nineThirteen = new javax.swing.JLabel();
        nineFourteen = new javax.swing.JLabel();
        eightFourteen = new javax.swing.JLabel();
        sevenFourteen = new javax.swing.JLabel();
        sixFourteen = new javax.swing.JLabel();
        fiveFourteen = new javax.swing.JLabel();
        fourFourteen = new javax.swing.JLabel();
        threeFourteen = new javax.swing.JLabel();
        threeFiveteen = new javax.swing.JLabel();
        fourFiveteen = new javax.swing.JLabel();
        fiveFiveteen = new javax.swing.JLabel();
        sixFiveteen = new javax.swing.JLabel();
        sevenFiveteen = new javax.swing.JLabel();
        eightFiveteen = new javax.swing.JLabel();
        nineFiveteen = new javax.swing.JLabel();
        zeroSixteen = new javax.swing.JLabel();
        zeroSeventeen = new javax.swing.JLabel();
        zeroEighteen = new javax.swing.JLabel();
        zeroNineteen = new javax.swing.JLabel();
        oneSixteen = new javax.swing.JLabel();
        twoSixteen = new javax.swing.JLabel();
        threeSixteen = new javax.swing.JLabel();
        fourSixteen = new javax.swing.JLabel();
        fiveSixteen = new javax.swing.JLabel();
        sixSixteen = new javax.swing.JLabel();
        sevenSixteen = new javax.swing.JLabel();
        eightSixteen = new javax.swing.JLabel();
        nineSixteen = new javax.swing.JLabel();
        nineSeventeen = new javax.swing.JLabel();
        eightSeventeen = new javax.swing.JLabel();
        sevenSeventeen = new javax.swing.JLabel();
        sixSeventeen = new javax.swing.JLabel();
        fiveSeventeen = new javax.swing.JLabel();
        fourSeventeen = new javax.swing.JLabel();
        threeSeventeen = new javax.swing.JLabel();
        twoSeventeen = new javax.swing.JLabel();
        oneSeventeen = new javax.swing.JLabel();
        oneEighteen = new javax.swing.JLabel();
        oneNineteen = new javax.swing.JLabel();
        twoEighteen = new javax.swing.JLabel();
        twoNineteen = new javax.swing.JLabel();
        threeEighteen = new javax.swing.JLabel();
        threeNineteen = new javax.swing.JLabel();
        fourEighteen = new javax.swing.JLabel();
        fourNineteen = new javax.swing.JLabel();
        fiveEighteen = new javax.swing.JLabel();
        sixEighteen = new javax.swing.JLabel();
        sevenEighteen = new javax.swing.JLabel();
        eighEighteen = new javax.swing.JLabel();
        nineEighteen = new javax.swing.JLabel();
        nineNineteen = new javax.swing.JLabel();
        eightNineteen = new javax.swing.JLabel();
        sevenNineteen = new javax.swing.JLabel();
        sixNineteen = new javax.swing.JLabel();
        fiveNineteen = new javax.swing.JLabel();
        tenZero = new javax.swing.JLabel();
        elevenZero = new javax.swing.JLabel();
        twelveZero = new javax.swing.JLabel();
        thirteenZero = new javax.swing.JLabel();
        fourteenZero = new javax.swing.JLabel();
        fiveteenZero = new javax.swing.JLabel();
        sixteenZero = new javax.swing.JLabel();
        seventeenZero = new javax.swing.JLabel();
        seventeenOne = new javax.swing.JLabel();
        sixteenOne = new javax.swing.JLabel();
        fiveteenOne = new javax.swing.JLabel();
        fourteenOne = new javax.swing.JLabel();
        thirteenOne = new javax.swing.JLabel();
        twelveOne = new javax.swing.JLabel();
        elevenOne = new javax.swing.JLabel();
        tenOne = new javax.swing.JLabel();
        tenTwo = new javax.swing.JLabel();
        tenThree = new javax.swing.JLabel();
        elevenTwo = new javax.swing.JLabel();
        elevenThree = new javax.swing.JLabel();
        twelveTwo = new javax.swing.JLabel();
        twelveThree = new javax.swing.JLabel();
        thirteenTwo = new javax.swing.JLabel();
        thirteenThree = new javax.swing.JLabel();
        fourteenTwo = new javax.swing.JLabel();
        fourteenThree = new javax.swing.JLabel();
        fiveteenTwo = new javax.swing.JLabel();
        fiveteenThree = new javax.swing.JLabel();
        sixteenTwo = new javax.swing.JLabel();
        sixteenThree = new javax.swing.JLabel();
        seventeenTwo = new javax.swing.JLabel();
        seventeenThree = new javax.swing.JLabel();
        seventeenFour = new javax.swing.JLabel();
        sixteenFour = new javax.swing.JLabel();
        fiveteenFour = new javax.swing.JLabel();
        fourteenFour = new javax.swing.JLabel();
        thirteenFour = new javax.swing.JLabel();
        twelveFour = new javax.swing.JLabel();
        elevenFour = new javax.swing.JLabel();
        tenFour = new javax.swing.JLabel();
        tenFive = new javax.swing.JLabel();
        elevenFive = new javax.swing.JLabel();
        twelveFive = new javax.swing.JLabel();
        thirteenFive = new javax.swing.JLabel();
        fourteenFive = new javax.swing.JLabel();
        fiveteenFive = new javax.swing.JLabel();
        sixteenFive = new javax.swing.JLabel();
        seventeenFive = new javax.swing.JLabel();
        seventeenSix = new javax.swing.JLabel();
        sixteenSix = new javax.swing.JLabel();
        fiveteenSix = new javax.swing.JLabel();
        fourteenSix = new javax.swing.JLabel();
        thirteenSix = new javax.swing.JLabel();
        twelveSix = new javax.swing.JLabel();
        elevenSix = new javax.swing.JLabel();
        tenSix = new javax.swing.JLabel();
        tenSeven = new javax.swing.JLabel();
        elevenSeven = new javax.swing.JLabel();
        twelveSeven = new javax.swing.JLabel();
        thirteenSeven = new javax.swing.JLabel();
        fourteenSeven = new javax.swing.JLabel();
        fiveteenSeven = new javax.swing.JLabel();
        sixteenSeven = new javax.swing.JLabel();
        seventeenSeven = new javax.swing.JLabel();
        seventeenEight = new javax.swing.JLabel();
        sixteenEight = new javax.swing.JLabel();
        fiveteenEight = new javax.swing.JLabel();
        fourteenEight = new javax.swing.JLabel();
        twelveEight = new javax.swing.JLabel();
        elevenEight = new javax.swing.JLabel();
        tenEight = new javax.swing.JLabel();
        tenNine = new javax.swing.JLabel();
        elevenNine = new javax.swing.JLabel();
        twelveNine = new javax.swing.JLabel();
        thirteenNine = new javax.swing.JLabel();
        fourteenNine = new javax.swing.JLabel();
        fiveteenNine = new javax.swing.JLabel();
        sixteenNine = new javax.swing.JLabel();
        seventeenNine = new javax.swing.JLabel();
        thirteenEight = new javax.swing.JLabel();
        seventeenTen = new javax.swing.JLabel();
        sixteenTen = new javax.swing.JLabel();
        fiveteenTen = new javax.swing.JLabel();
        fourteenTen = new javax.swing.JLabel();
        thirteenTen = new javax.swing.JLabel();
        twelveTen = new javax.swing.JLabel();
        elevenTen = new javax.swing.JLabel();
        tenTen = new javax.swing.JLabel();
        tenEleven = new javax.swing.JLabel();
        elevenEleven = new javax.swing.JLabel();
        twelveEleven = new javax.swing.JLabel();
        thirteenEleven = new javax.swing.JLabel();
        fourteenEleven = new javax.swing.JLabel();
        fiveteenEleven = new javax.swing.JLabel();
        sixteenEleven = new javax.swing.JLabel();
        seventeenEleven = new javax.swing.JLabel();
        seventeenTwelve = new javax.swing.JLabel();
        sixteenTwelve = new javax.swing.JLabel();
        fiveteenTwelve = new javax.swing.JLabel();
        fourteenTwelve = new javax.swing.JLabel();
        thirteenTwelve = new javax.swing.JLabel();
        twelveTwelve = new javax.swing.JLabel();
        elevenTwelve = new javax.swing.JLabel();
        tenTwelve = new javax.swing.JLabel();
        tenFourteen = new javax.swing.JLabel();
        elevenFourteen = new javax.swing.JLabel();
        twelveFourteen = new javax.swing.JLabel();
        thirteenFourteen = new javax.swing.JLabel();
        fourteenFourteen = new javax.swing.JLabel();
        fiveteenFourteen = new javax.swing.JLabel();
        sixteenFourteen = new javax.swing.JLabel();
        seventeenFourteen = new javax.swing.JLabel();
        tenFiveteen = new javax.swing.JLabel();
        elevenFiveteen = new javax.swing.JLabel();
        twelveFiveteen = new javax.swing.JLabel();
        thirteenFiveteen = new javax.swing.JLabel();
        fourteenFiveteen = new javax.swing.JLabel();
        fiveteenFiveteen = new javax.swing.JLabel();
        sixteenFiveteen = new javax.swing.JLabel();
        seventeenFiveteen = new javax.swing.JLabel();
        eighteenFiveteen = new javax.swing.JLabel();
        nineteenFiveteen = new javax.swing.JLabel();
        nineteenSixteen = new javax.swing.JLabel();
        eighteenSixteen = new javax.swing.JLabel();
        seventeenSixteen = new javax.swing.JLabel();
        sixteenSixteen = new javax.swing.JLabel();
        fiveteenSixteen = new javax.swing.JLabel();
        fourteenSixteen = new javax.swing.JLabel();
        thirteenSixteen = new javax.swing.JLabel();
        twelveSixteen = new javax.swing.JLabel();
        elevenSixteen = new javax.swing.JLabel();
        tenSixteen = new javax.swing.JLabel();
        tenSeventeen = new javax.swing.JLabel();
        elevenSeventeen = new javax.swing.JLabel();
        twelveSeventeen = new javax.swing.JLabel();
        thirteenSeventeen = new javax.swing.JLabel();
        fourteenSeventeen = new javax.swing.JLabel();
        fiveteenSeventeen = new javax.swing.JLabel();
        sixteenSeventeen = new javax.swing.JLabel();
        seventeenSeventeen = new javax.swing.JLabel();
        eighteenSeventeen = new javax.swing.JLabel();
        nineteenSeventeen = new javax.swing.JLabel();
        nineteenEighteen = new javax.swing.JLabel();
        eighteenEighteen = new javax.swing.JLabel();
        seventeenEighteen = new javax.swing.JLabel();
        sixteenEighteen = new javax.swing.JLabel();
        fiveteenEighteen = new javax.swing.JLabel();
        fourteenEighteen = new javax.swing.JLabel();
        thirteenEighteen = new javax.swing.JLabel();
        twelveEighteen = new javax.swing.JLabel();
        elevenEighteen = new javax.swing.JLabel();
        nineteenFourteen = new javax.swing.JLabel();
        eighteenFourteen = new javax.swing.JLabel();
        nineteenThirteen = new javax.swing.JLabel();
        eighteenThirteen = new javax.swing.JLabel();
        eighteenTen = new javax.swing.JLabel();
        nineteenTen = new javax.swing.JLabel();
        nineteenEleven = new javax.swing.JLabel();
        eighteenEleven = new javax.swing.JLabel();
        eighteenTwelve = new javax.swing.JLabel();
        nineteenTwelve = new javax.swing.JLabel();
        nineteenNine = new javax.swing.JLabel();
        eighteenNine = new javax.swing.JLabel();
        nineteenEight = new javax.swing.JLabel();
        eighteenEight = new javax.swing.JLabel();
        nineteenSeven = new javax.swing.JLabel();
        eighteenSeven = new javax.swing.JLabel();
        eighteenZero = new javax.swing.JLabel();
        nineteenZero = new javax.swing.JLabel();
        nineteenOne = new javax.swing.JLabel();
        eighteenOne = new javax.swing.JLabel();
        eighteenTwo = new javax.swing.JLabel();
        nineteenTwo = new javax.swing.JLabel();
        nineteenThree = new javax.swing.JLabel();
        eighteenThree = new javax.swing.JLabel();
        eighteenFour = new javax.swing.JLabel();
        nineteenFour = new javax.swing.JLabel();
        eighteenFive = new javax.swing.JLabel();
        nineteenFive = new javax.swing.JLabel();
        eighteenSix = new javax.swing.JLabel();
        nineteenSix = new javax.swing.JLabel();
        seventeenThirteen = new javax.swing.JLabel();
        sixteenThirteen = new javax.swing.JLabel();
        fiveteenThirteen = new javax.swing.JLabel();
        fourteenThirteen = new javax.swing.JLabel();
        thirteenThirteen = new javax.swing.JLabel();
        twelveThirteen = new javax.swing.JLabel();
        elevenThirteen = new javax.swing.JLabel();
        tenThirteen = new javax.swing.JLabel();
        tenEighteen = new javax.swing.JLabel();
        tenNineteen = new javax.swing.JLabel();
        elevenNineteen = new javax.swing.JLabel();
        twelveNineteen = new javax.swing.JLabel();
        thirteenNineteen = new javax.swing.JLabel();
        fourteenNineteen = new javax.swing.JLabel();
        fiveteenNineteen = new javax.swing.JLabel();
        sixteenNineteen = new javax.swing.JLabel();
        seventeenNineteen = new javax.swing.JLabel();
        eighteenNineteen = new javax.swing.JLabel();
        nineteenNineteen = new javax.swing.JLabel();
        timerProcessingJButton = new javax.swing.JButton();
        startTimerJButton = new javax.swing.JButton();
        panelDescriptionJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        gridJPanel.setBackground(new java.awt.Color(153, 204, 255));
        gridJPanel.setForeground(new java.awt.Color(0, 204, 204));

        zeroZero.setBackground(new java.awt.Color(255, 255, 255));
        zeroZero.setForeground(new java.awt.Color(51, 51, 51));
        zeroZero.setText("***");
        zeroZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneTwo.setText("***");
        oneTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneZero.setText("***");
        oneZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoZero.setText("***");
        twoZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeZero.setText("***");
        threeZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourZero.setText("***");
        fourZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveZero.setText("***");
        fiveZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixZero.setText("***");
        sixZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenZero.setText("***");
        sevenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightZero.setText("***");
        eightZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineZero.setText("***");
        nineZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineOne.setText("***");
        nineOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightOne.setText("***");
        eightOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenOne.setText("***");
        sevenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixOne.setText("***");
        sixOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveOne.setText("***");
        fiveOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourOne.setText("***");
        fourOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeOne.setText("***");
        threeOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoOne.setText("***");
        twoOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroOne.setText("***");
        zeroOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneOne.setText("***");
        oneOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoTwo.setText("***");
        twoTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroTwo.setText("***");
        zeroTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroThree.setText("***");
        zeroThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroFour.setText("***");
        zeroFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroFive.setText("***");
        zeroFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroSix.setText("***");
        zeroSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroSeven.setText("***");
        zeroSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneSeven.setText("***");
        oneSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneThree.setText("***");
        oneThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoThree.setText("***");
        twoThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeThree.setText("***");
        threeThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourThree.setText("***");
        fourThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveThree.setText("***");
        fiveThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixThree.setText("***");
        sixThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenThree.setText("***");
        sevenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightThree.setText("***");
        eightThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineThree.setText("***");
        nineThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineTwo.setText("***");
        nineTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightTwo.setText("***");
        eightTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenTwo.setText("***");
        sevenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixTwo.setText("***");
        sixTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveTwo.setText("***");
        fiveTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourTwo.setText("***");
        fourTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeTwo.setText("***");
        threeTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoFour.setText("***");
        twoFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneFour.setText("***");
        oneFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeFour.setText("***");
        threeFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourFour.setText("***");
        fourFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveFour.setText("***");
        fiveFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixFour.setText("***");
        sixFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenFour.setText("***");
        sevenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightFour.setText("***");
        eightFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineFour.setText("***");
        nineFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineFive.setText("***");
        nineFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightFive.setText("***");
        eightFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenFive.setText("***");
        sevenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixFive.setText("***");
        sixFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveFive.setText("***");
        fiveFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourFive.setText("***");
        fourFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeFive.setText("***");
        threeFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoFive.setText("***");
        twoFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneFive.setText("***");
        oneFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneSix.setText("***");
        oneSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoSix.setText("***");
        twoSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeSix.setText("***");
        threeSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourSix.setText("***");
        fourSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveSix.setText("***");
        fiveSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixSix.setText("***");
        sixSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenSix.setText("***");
        sevenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightSix.setText("***");
        eightSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineSix.setText("***");
        nineSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineSeven.setText("***");
        nineSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightSeven.setText("***");
        eightSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenSeven.setText("***");
        sevenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixSeven.setText("***");
        sixSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveSeven.setText("***");
        fiveSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourSeven.setText("***");
        fourSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeSeven.setText("***");
        threeSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoSeven.setText("***");
        twoSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroEight.setText("***");
        zeroEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneEight.setText("***");
        oneEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoEight.setText("***");
        twoEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeEight.setText("***");
        threeEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourEight.setText("***");
        fourEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveEight.setText("***");
        fiveEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixEight.setText("***");
        sixEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenEight.setText("***");
        sevenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightEight.setText("***");
        eightEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineEight.setText("***");
        nineEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroNine.setText("***");
        zeroNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneNine.setText("***");
        oneNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoNine.setText("***");
        twoNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeNine.setText("***");
        threeNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourNine.setText("***");
        fourNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveNine.setText("***");
        fiveNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixNine.setText("***");
        sixNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenNine.setText("***");
        sevenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightNine.setText("***");
        eightNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineNine.setText("***");
        nineNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineTen.setText("***");
        nineTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightTen.setText("***");
        eightTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenTen.setText("***");
        sevenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixTen.setText("***");
        sixTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveTen.setText("***");
        fiveTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourTen.setText("***");
        fourTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeTen.setText("***");
        threeTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoTen.setText("***");
        twoTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneTen.setText("***");
        oneTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroTen.setText("***");
        zeroTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroEleven.setText("***");
        zeroEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneEleven.setText("***");
        oneEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoEleven.setText("***");
        twoEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeEleven.setText("***");
        threeEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourEleven.setText("***");
        fourEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveEleven.setText("***");
        fiveEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixEleven.setText("***");
        sixEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenEleven.setText("***");
        sevenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightEleven.setText("***");
        eightEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineEleven.setText("***");
        nineEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineTwelve.setText("***");
        nineTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightTwelve.setText("***");
        eightTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenTwelve.setText("***");
        sevenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixTwelve.setText("***");
        sixTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveTwelve.setText("***");
        fiveTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourTwelve.setText("***");
        fourTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeTwelve.setText("***");
        threeTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoTwelve.setText("***");
        twoTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneTwelve.setText("***");
        oneTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroTwelve.setText("***");
        zeroTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroThirteen.setText("***");
        zeroThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroFourteen.setText("***");
        zeroFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroFiveteen.setText("***");
        zeroFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneThirteen.setText("***");
        oneThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneFourteen.setText("***");
        oneFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneFiveteen.setText("***");
        oneFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoThirteen.setText("***");
        twoThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoFourteen.setText("***");
        twoFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoFiveteen.setText("***");
        twoFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeThirteen.setText("***");
        threeThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourThirteen.setText("***");
        fourThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveThirteen.setText("***");
        fiveThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixThirteen.setText("***");
        sixThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenThirteen.setText("***");
        sevenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightThirteen.setText("***");
        eightThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineThirteen.setText("***");
        nineThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineFourteen.setText("***");
        nineFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightFourteen.setText("***");
        eightFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenFourteen.setText("***");
        sevenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixFourteen.setText("***");
        sixFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveFourteen.setText("***");
        fiveFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourFourteen.setText("***");
        fourFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeFourteen.setText("***");
        threeFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeFiveteen.setText("***");
        threeFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourFiveteen.setText("***");
        fourFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveFiveteen.setText("***");
        fiveFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixFiveteen.setText("***");
        sixFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenFiveteen.setText("***");
        sevenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightFiveteen.setText("***");
        eightFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineFiveteen.setText("***");
        nineFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroSixteen.setText("***");
        zeroSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroSeventeen.setText("***");
        zeroSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroEighteen.setText("***");
        zeroEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        zeroNineteen.setText("***");
        zeroNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneSixteen.setText("***");
        oneSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoSixteen.setText("***");
        twoSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeSixteen.setText("***");
        threeSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourSixteen.setText("***");
        fourSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveSixteen.setText("***");
        fiveSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixSixteen.setText("***");
        sixSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenSixteen.setText("***");
        sevenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightSixteen.setText("***");
        eightSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineSixteen.setText("***");
        nineSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineSeventeen.setText("***");
        nineSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightSeventeen.setText("***");
        eightSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenSeventeen.setText("***");
        sevenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixSeventeen.setText("***");
        sixSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveSeventeen.setText("***");
        fiveSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourSeventeen.setText("***");
        fourSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeSeventeen.setText("***");
        threeSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoSeventeen.setText("***");
        twoSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneSeventeen.setText("***");
        oneSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneEighteen.setText("***");
        oneEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        oneNineteen.setText("***");
        oneNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoEighteen.setText("***");
        twoEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twoNineteen.setText("***");
        twoNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeEighteen.setText("***");
        threeEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        threeNineteen.setText("***");
        threeNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourEighteen.setText("***");
        fourEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourNineteen.setText("***");
        fourNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveEighteen.setText("***");
        fiveEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixEighteen.setText("***");
        sixEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenEighteen.setText("***");
        sevenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighEighteen.setText("***");
        eighEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineEighteen.setText("***");
        nineEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineNineteen.setForeground(new java.awt.Color(255, 51, 51));
        nineNineteen.setText("***");
        nineNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eightNineteen.setText("***");
        eightNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sevenNineteen.setText("***");
        sevenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixNineteen.setText("***");
        sixNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveNineteen.setText("***");
        fiveNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenZero.setText("***");
        tenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenZero.setText("***");
        elevenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveZero.setText("***");
        twelveZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenZero.setText("***");
        thirteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenZero.setText("***");
        fourteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenZero.setText("***");
        fiveteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenZero.setText("***");
        sixteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenZero.setText("***");
        seventeenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenOne.setText("***");
        seventeenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenOne.setText("***");
        sixteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenOne.setText("***");
        fiveteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenOne.setText("***");
        fourteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenOne.setText("***");
        thirteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveOne.setText("***");
        twelveOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenOne.setText("***");
        elevenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenOne.setText("***");
        tenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenTwo.setText("***");
        tenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenThree.setText("***");
        tenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenTwo.setText("***");
        elevenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenThree.setText("***");
        elevenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveTwo.setText("***");
        twelveTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveThree.setText("***");
        twelveThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenTwo.setText("***");
        thirteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenThree.setText("***");
        thirteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenTwo.setText("***");
        fourteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenThree.setText("***");
        fourteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenTwo.setText("***");
        fiveteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenThree.setText("***");
        fiveteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenTwo.setText("***");
        sixteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenThree.setText("***");
        sixteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenTwo.setText("***");
        seventeenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenThree.setText("***");
        seventeenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenFour.setText("***");
        seventeenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenFour.setText("***");
        sixteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenFour.setText("***");
        fiveteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenFour.setText("***");
        fourteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenFour.setText("***");
        thirteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveFour.setText("***");
        twelveFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenFour.setText("***");
        elevenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenFour.setText("***");
        tenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenFive.setText("***");
        tenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenFive.setText("***");
        elevenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveFive.setText("***");
        twelveFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenFive.setText("***");
        thirteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenFive.setText("***");
        fourteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenFive.setText("***");
        fiveteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenFive.setText("***");
        sixteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenFive.setText("***");
        seventeenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenSix.setText("***");
        seventeenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenSix.setText("***");
        sixteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenSix.setText("***");
        fiveteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenSix.setText("***");
        fourteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenSix.setText("***");
        thirteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveSix.setText("***");
        twelveSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenSix.setText("***");
        elevenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenSix.setText("***");
        tenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenSeven.setText("***");
        tenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenSeven.setText("***");
        elevenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveSeven.setText("***");
        twelveSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenSeven.setText("***");
        thirteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenSeven.setText("***");
        fourteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenSeven.setText("***");
        fiveteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenSeven.setText("***");
        sixteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenSeven.setText("***");
        seventeenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenEight.setText("***");
        seventeenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenEight.setText("***");
        sixteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenEight.setText("***");
        fiveteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenEight.setText("***");
        fourteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveEight.setText("***");
        twelveEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenEight.setText("***");
        elevenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenEight.setText("***");
        tenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenNine.setText("***");
        tenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenNine.setText("***");
        elevenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveNine.setText("***");
        twelveNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenNine.setText("***");
        thirteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenNine.setText("***");
        fourteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenNine.setText("***");
        fiveteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenNine.setText("***");
        sixteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenNine.setText("***");
        seventeenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenEight.setText("***");
        thirteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenTen.setText("***");
        seventeenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenTen.setText("***");
        sixteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenTen.setText("***");
        fiveteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenTen.setText("***");
        fourteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenTen.setText("***");
        thirteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveTen.setText("***");
        twelveTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenTen.setText("***");
        elevenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenTen.setText("***");
        tenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenEleven.setText("***");
        tenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenEleven.setText("***");
        elevenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveEleven.setText("***");
        twelveEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenEleven.setText("***");
        thirteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenEleven.setText("***");
        fourteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenEleven.setText("***");
        fiveteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenEleven.setText("***");
        sixteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenEleven.setText("***");
        seventeenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenTwelve.setText("***");
        seventeenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenTwelve.setText("***");
        sixteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenTwelve.setText("***");
        fiveteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenTwelve.setText("***");
        fourteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenTwelve.setText("***");
        thirteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveTwelve.setText("***");
        twelveTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenTwelve.setText("***");
        elevenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenTwelve.setText("***");
        tenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenFourteen.setText("***");
        tenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenFourteen.setText("***");
        elevenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveFourteen.setText("***");
        twelveFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenFourteen.setText("***");
        thirteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenFourteen.setText("***");
        fourteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenFourteen.setText("***");
        fiveteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenFourteen.setText("***");
        sixteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenFourteen.setText("***");
        seventeenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenFiveteen.setText("***");
        tenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenFiveteen.setText("***");
        elevenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveFiveteen.setText("***");
        twelveFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenFiveteen.setText("***");
        thirteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenFiveteen.setText("***");
        fourteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenFiveteen.setText("***");
        fiveteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenFiveteen.setText("***");
        sixteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenFiveteen.setText("***");
        seventeenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenFiveteen.setText("***");
        eighteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenFiveteen.setText("***");
        nineteenFiveteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenSixteen.setText("***");
        nineteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenSixteen.setText("***");
        eighteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenSixteen.setText("***");
        seventeenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenSixteen.setText("***");
        sixteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenSixteen.setText("***");
        fiveteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenSixteen.setText("***");
        fourteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenSixteen.setText("***");
        thirteenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveSixteen.setText("***");
        twelveSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenSixteen.setText("***");
        elevenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenSixteen.setText("***");
        tenSixteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenSeventeen.setText("***");
        tenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenSeventeen.setText("***");
        elevenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveSeventeen.setText("***");
        twelveSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenSeventeen.setText("***");
        thirteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenSeventeen.setText("***");
        fourteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenSeventeen.setText("***");
        fiveteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenSeventeen.setText("***");
        sixteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenSeventeen.setText("***");
        seventeenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenSeventeen.setText("***");
        eighteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenSeventeen.setText("***");
        nineteenSeventeen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenEighteen.setText("***");
        nineteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenEighteen.setText("***");
        eighteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenEighteen.setText("***");
        seventeenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenEighteen.setText("***");
        sixteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenEighteen.setText("***");
        fiveteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenEighteen.setText("***");
        fourteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenEighteen.setText("***");
        thirteenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveEighteen.setText("***");
        twelveEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenEighteen.setText("***");
        elevenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenFourteen.setText("***");
        nineteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenFourteen.setText("***");
        eighteenFourteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenThirteen.setText("***");
        nineteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenThirteen.setText("***");
        eighteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenTen.setText("***");
        eighteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenTen.setText("***");
        nineteenTen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenEleven.setText("***");
        nineteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenEleven.setText("***");
        eighteenEleven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenTwelve.setText("***");
        eighteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenTwelve.setText("***");
        nineteenTwelve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenNine.setText("***");
        nineteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenNine.setText("***");
        eighteenNine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenEight.setText("***");
        nineteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenEight.setText("***");
        eighteenEight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenSeven.setText("***");
        nineteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenSeven.setText("***");
        eighteenSeven.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenZero.setText("***");
        eighteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenZero.setText("***");
        nineteenZero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenOne.setText("***");
        nineteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenOne.setText("***");
        eighteenOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenTwo.setText("***");
        eighteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenTwo.setText("***");
        nineteenTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenThree.setText("***");
        nineteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenThree.setText("***");
        eighteenThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenFour.setText("***");
        eighteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenFour.setText("***");
        nineteenFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenFive.setText("***");
        eighteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenFive.setText("***");
        nineteenFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenSix.setText("***");
        eighteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenSix.setText("***");
        nineteenSix.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenThirteen.setText("***");
        seventeenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenThirteen.setText("***");
        sixteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenThirteen.setText("***");
        fiveteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenThirteen.setText("***");
        fourteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenThirteen.setText("***");
        thirteenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveThirteen.setText("***");
        twelveThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenThirteen.setText("***");
        elevenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenThirteen.setText("***");
        tenThirteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenEighteen.setText("***");
        tenEighteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tenNineteen.setText("***");
        tenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        elevenNineteen.setText("***");
        elevenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        twelveNineteen.setText("***");
        twelveNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        thirteenNineteen.setText("***");
        thirteenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fourteenNineteen.setText("***");
        fourteenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fiveteenNineteen.setText("***");
        fiveteenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sixteenNineteen.setText("***");
        sixteenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        seventeenNineteen.setText("***");
        seventeenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        eighteenNineteen.setText("***");
        eighteenNineteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nineteenNineteen.setBackground(new java.awt.Color(0, 0, 153));
        nineteenNineteen.setForeground(new java.awt.Color(51, 0, 153));
        nineteenNineteen.setText("***");
        nineteenNineteen.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout gridJPanelLayout = new javax.swing.GroupLayout(gridJPanel);
        gridJPanel.setLayout(gridJPanelLayout);
        gridJPanelLayout.setHorizontalGroup(
            gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridJPanelLayout.createSequentialGroup()
                .addContainerGap(1458, Short.MAX_VALUE)
                .addComponent(nineteenNineteen)
                .addGap(61, 61, 61))
            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gridJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(zeroZero)
                            .addGap(54, 54, 54)
                            .addComponent(zeroOne)
                            .addGap(54, 54, 54)
                            .addComponent(zeroTwo)
                            .addGap(54, 54, 54)
                            .addComponent(zeroThree)
                            .addGap(54, 54, 54)
                            .addComponent(zeroFour)
                            .addGap(54, 54, 54)
                            .addComponent(zeroFive)
                            .addGap(54, 54, 54)
                            .addComponent(zeroSix)
                            .addGap(54, 54, 54)
                            .addComponent(zeroSeven)
                            .addGap(54, 54, 54)
                            .addComponent(zeroEight)
                            .addGap(54, 54, 54)
                            .addComponent(zeroNine)
                            .addGap(54, 54, 54)
                            .addComponent(zeroTen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroEleven)
                            .addGap(54, 54, 54)
                            .addComponent(zeroTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(zeroThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(zeroNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(oneZero)
                            .addGap(54, 54, 54)
                            .addComponent(oneOne)
                            .addGap(54, 54, 54)
                            .addComponent(oneTwo)
                            .addGap(54, 54, 54)
                            .addComponent(oneThree)
                            .addGap(54, 54, 54)
                            .addComponent(oneFour)
                            .addGap(54, 54, 54)
                            .addComponent(oneFive)
                            .addGap(54, 54, 54)
                            .addComponent(oneSix)
                            .addGap(54, 54, 54)
                            .addComponent(oneSeven)
                            .addGap(54, 54, 54)
                            .addComponent(oneEight)
                            .addGap(54, 54, 54)
                            .addComponent(oneNine)
                            .addGap(54, 54, 54)
                            .addComponent(oneTen)
                            .addGap(54, 54, 54)
                            .addComponent(oneEleven)
                            .addGap(54, 54, 54)
                            .addComponent(oneTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(oneThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(oneFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(oneFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(oneSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(oneSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(oneEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(oneNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(twoZero)
                            .addGap(54, 54, 54)
                            .addComponent(twoOne)
                            .addGap(54, 54, 54)
                            .addComponent(twoTwo)
                            .addGap(54, 54, 54)
                            .addComponent(twoThree)
                            .addGap(54, 54, 54)
                            .addComponent(twoFour)
                            .addGap(54, 54, 54)
                            .addComponent(twoFive)
                            .addGap(54, 54, 54)
                            .addComponent(twoSix)
                            .addGap(54, 54, 54)
                            .addComponent(twoSeven)
                            .addGap(54, 54, 54)
                            .addComponent(twoEight)
                            .addGap(54, 54, 54)
                            .addComponent(twoNine)
                            .addGap(54, 54, 54)
                            .addComponent(twoTen)
                            .addGap(54, 54, 54)
                            .addComponent(twoEleven)
                            .addGap(54, 54, 54)
                            .addComponent(twoTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(twoThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(twoFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(twoFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(twoSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(twoSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(twoEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(twoNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(threeZero)
                            .addGap(54, 54, 54)
                            .addComponent(threeOne)
                            .addGap(54, 54, 54)
                            .addComponent(threeTwo)
                            .addGap(54, 54, 54)
                            .addComponent(threeThree)
                            .addGap(54, 54, 54)
                            .addComponent(threeFour)
                            .addGap(54, 54, 54)
                            .addComponent(threeFive)
                            .addGap(54, 54, 54)
                            .addComponent(threeSix)
                            .addGap(54, 54, 54)
                            .addComponent(threeSeven)
                            .addGap(54, 54, 54)
                            .addComponent(threeEight)
                            .addGap(54, 54, 54)
                            .addComponent(threeNine)
                            .addGap(54, 54, 54)
                            .addComponent(threeTen)
                            .addGap(54, 54, 54)
                            .addComponent(threeEleven)
                            .addGap(54, 54, 54)
                            .addComponent(threeTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(threeThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(threeFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(threeFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(threeSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(threeSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(threeEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(threeNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(fourZero)
                            .addGap(54, 54, 54)
                            .addComponent(fourOne)
                            .addGap(54, 54, 54)
                            .addComponent(fourTwo)
                            .addGap(54, 54, 54)
                            .addComponent(fourThree)
                            .addGap(54, 54, 54)
                            .addComponent(fourFour)
                            .addGap(54, 54, 54)
                            .addComponent(fourFive)
                            .addGap(54, 54, 54)
                            .addComponent(fourSix)
                            .addGap(54, 54, 54)
                            .addComponent(fourSeven)
                            .addGap(54, 54, 54)
                            .addComponent(fourEight)
                            .addGap(54, 54, 54)
                            .addComponent(fourNine)
                            .addGap(54, 54, 54)
                            .addComponent(fourTen)
                            .addGap(54, 54, 54)
                            .addComponent(fourEleven)
                            .addGap(54, 54, 54)
                            .addComponent(fourTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(fourThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(fourEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(fiveZero)
                            .addGap(54, 54, 54)
                            .addComponent(fiveOne)
                            .addGap(54, 54, 54)
                            .addComponent(fiveTwo)
                            .addGap(54, 54, 54)
                            .addComponent(fiveThree)
                            .addGap(54, 54, 54)
                            .addComponent(fiveFour)
                            .addGap(54, 54, 54)
                            .addComponent(fiveFive)
                            .addGap(54, 54, 54)
                            .addComponent(fiveSix)
                            .addGap(54, 54, 54)
                            .addComponent(fiveSeven)
                            .addGap(54, 54, 54)
                            .addComponent(fiveEight)
                            .addGap(54, 54, 54)
                            .addComponent(fiveNine)
                            .addGap(54, 54, 54)
                            .addComponent(fiveTen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveEleven)
                            .addGap(54, 54, 54)
                            .addComponent(fiveTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(fiveThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(sixZero)
                            .addGap(54, 54, 54)
                            .addComponent(sixOne)
                            .addGap(54, 54, 54)
                            .addComponent(sixTwo)
                            .addGap(54, 54, 54)
                            .addComponent(sixThree)
                            .addGap(54, 54, 54)
                            .addComponent(sixFour)
                            .addGap(54, 54, 54)
                            .addComponent(sixFive)
                            .addGap(54, 54, 54)
                            .addComponent(sixSix)
                            .addGap(54, 54, 54)
                            .addComponent(sixSeven)
                            .addGap(54, 54, 54)
                            .addComponent(sixEight)
                            .addGap(54, 54, 54)
                            .addComponent(sixNine)
                            .addGap(54, 54, 54)
                            .addComponent(sixTen)
                            .addGap(54, 54, 54)
                            .addComponent(sixEleven)
                            .addGap(54, 54, 54)
                            .addComponent(sixTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(sixThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(sixEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(sevenZero)
                            .addGap(54, 54, 54)
                            .addComponent(sevenOne)
                            .addGap(54, 54, 54)
                            .addComponent(sevenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(sevenThree)
                            .addGap(54, 54, 54)
                            .addComponent(sevenFour)
                            .addGap(54, 54, 54)
                            .addComponent(sevenFive)
                            .addGap(54, 54, 54)
                            .addComponent(sevenSix)
                            .addGap(54, 54, 54)
                            .addComponent(sevenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(sevenEight)
                            .addGap(54, 54, 54)
                            .addComponent(sevenNine)
                            .addGap(54, 54, 54)
                            .addComponent(sevenTen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(sevenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(sevenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(sevenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(eightZero)
                            .addGap(54, 54, 54)
                            .addComponent(eightOne)
                            .addGap(54, 54, 54)
                            .addComponent(eightTwo)
                            .addGap(54, 54, 54)
                            .addComponent(eightThree)
                            .addGap(54, 54, 54)
                            .addComponent(eightFour)
                            .addGap(54, 54, 54)
                            .addComponent(eightFive)
                            .addGap(54, 54, 54)
                            .addComponent(eightSix)
                            .addGap(54, 54, 54)
                            .addComponent(eightSeven)
                            .addGap(54, 54, 54)
                            .addComponent(eightEight)
                            .addGap(54, 54, 54)
                            .addComponent(eightNine)
                            .addGap(54, 54, 54)
                            .addComponent(eightTen)
                            .addGap(54, 54, 54)
                            .addComponent(eightEleven)
                            .addGap(54, 54, 54)
                            .addComponent(eightTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(eightThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(eightFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(eightFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(eightSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(eightSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(eighEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(eightNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(nineZero)
                            .addGap(54, 54, 54)
                            .addComponent(nineOne)
                            .addGap(54, 54, 54)
                            .addComponent(nineTwo)
                            .addGap(54, 54, 54)
                            .addComponent(nineThree)
                            .addGap(54, 54, 54)
                            .addComponent(nineFour)
                            .addGap(54, 54, 54)
                            .addComponent(nineFive)
                            .addGap(54, 54, 54)
                            .addComponent(nineSix)
                            .addGap(54, 54, 54)
                            .addComponent(nineSeven)
                            .addGap(54, 54, 54)
                            .addComponent(nineEight)
                            .addGap(54, 54, 54)
                            .addComponent(nineNine)
                            .addGap(54, 54, 54)
                            .addComponent(nineTen)
                            .addGap(54, 54, 54)
                            .addComponent(nineEleven)
                            .addGap(54, 54, 54)
                            .addComponent(nineTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(nineThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(nineEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(tenZero)
                            .addGap(54, 54, 54)
                            .addComponent(tenOne)
                            .addGap(54, 54, 54)
                            .addComponent(tenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(tenThree)
                            .addGap(54, 54, 54)
                            .addComponent(tenFour)
                            .addGap(54, 54, 54)
                            .addComponent(tenFive)
                            .addGap(54, 54, 54)
                            .addComponent(tenSix)
                            .addGap(54, 54, 54)
                            .addComponent(tenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(tenEight)
                            .addGap(54, 54, 54)
                            .addComponent(tenNine)
                            .addGap(54, 54, 54)
                            .addComponent(tenTen)
                            .addGap(54, 54, 54)
                            .addComponent(tenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(tenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(tenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(tenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(tenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(tenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(tenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(tenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(tenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(elevenZero)
                            .addGap(54, 54, 54)
                            .addComponent(elevenOne)
                            .addGap(54, 54, 54)
                            .addComponent(elevenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(elevenThree)
                            .addGap(54, 54, 54)
                            .addComponent(elevenFour)
                            .addGap(54, 54, 54)
                            .addComponent(elevenFive)
                            .addGap(54, 54, 54)
                            .addComponent(elevenSix)
                            .addGap(54, 54, 54)
                            .addComponent(elevenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(elevenEight)
                            .addGap(54, 54, 54)
                            .addComponent(elevenNine)
                            .addGap(54, 54, 54)
                            .addComponent(elevenTen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(elevenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(elevenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(elevenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(twelveZero)
                            .addGap(54, 54, 54)
                            .addComponent(twelveOne)
                            .addGap(54, 54, 54)
                            .addComponent(twelveTwo)
                            .addGap(54, 54, 54)
                            .addComponent(twelveThree)
                            .addGap(54, 54, 54)
                            .addComponent(twelveFour)
                            .addGap(54, 54, 54)
                            .addComponent(twelveFive)
                            .addGap(54, 54, 54)
                            .addComponent(twelveSix)
                            .addGap(54, 54, 54)
                            .addComponent(twelveSeven)
                            .addGap(54, 54, 54)
                            .addComponent(twelveEight)
                            .addGap(54, 54, 54)
                            .addComponent(twelveNine)
                            .addGap(54, 54, 54)
                            .addComponent(twelveTen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveEleven)
                            .addGap(54, 54, 54)
                            .addComponent(twelveTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(twelveThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(twelveNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(thirteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(thirteenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(fourteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(fourteenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(fiveteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(fiveteenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(sixteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(sixteenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(seventeenZero)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenOne)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenThree)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenFour)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenFive)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenSix)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenEight)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenNine)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenTen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(seventeenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(eighteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenThirteen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenFourteen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenSixteen)
                            .addGap(56, 56, 56)
                            .addComponent(eighteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenEighteen)
                            .addGap(54, 54, 54)
                            .addComponent(eighteenNineteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addComponent(nineteenZero)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenOne)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenTwo)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenThree)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenFour)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenFive)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenSix)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenSeven)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenEight)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenNine)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenTen)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenEleven)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenTwelve)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenThirteen)
                            .addGap(56, 56, 56)
                            .addComponent(nineteenFourteen)
                            .addGap(52, 52, 52)
                            .addComponent(nineteenFiveteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenSixteen)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenSeventeen)
                            .addGap(54, 54, 54)
                            .addComponent(nineteenEighteen)))
                    .addContainerGap(61, Short.MAX_VALUE)))
        );
        gridJPanelLayout.setVerticalGroup(
            gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gridJPanelLayout.createSequentialGroup()
                .addContainerGap(728, Short.MAX_VALUE)
                .addComponent(nineteenNineteen)
                .addGap(34, 34, 34))
            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gridJPanelLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(zeroZero))
                        .addComponent(zeroOne)
                        .addComponent(zeroTwo)
                        .addComponent(zeroThree)
                        .addComponent(zeroFour)
                        .addComponent(zeroFive)
                        .addComponent(zeroSix)
                        .addComponent(zeroSeven)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(zeroEight, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(zeroNine)
                        .addComponent(zeroTen)
                        .addComponent(zeroEleven)
                        .addComponent(zeroTwelve)
                        .addComponent(zeroThirteen)
                        .addComponent(zeroFourteen)
                        .addComponent(zeroFiveteen)
                        .addComponent(zeroSixteen)
                        .addComponent(zeroSeventeen)
                        .addComponent(zeroEighteen)
                        .addComponent(zeroNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(oneZero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(oneOne)
                        .addComponent(oneTwo)
                        .addComponent(oneThree)
                        .addComponent(oneFour)
                        .addComponent(oneFive)
                        .addComponent(oneSix)
                        .addComponent(oneSeven)
                        .addComponent(oneEight)
                        .addComponent(oneNine)
                        .addComponent(oneTen)
                        .addComponent(oneEleven)
                        .addComponent(oneTwelve)
                        .addComponent(oneThirteen)
                        .addComponent(oneFourteen)
                        .addComponent(oneFiveteen)
                        .addComponent(oneSixteen)
                        .addComponent(oneSeventeen)
                        .addComponent(oneEighteen)
                        .addComponent(oneNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(twoZero)
                        .addComponent(twoOne)
                        .addComponent(twoTwo)
                        .addComponent(twoThree)
                        .addComponent(twoFour)
                        .addComponent(twoFive)
                        .addComponent(twoSix)
                        .addComponent(twoSeven)
                        .addComponent(twoEight)
                        .addComponent(twoNine)
                        .addComponent(twoTen)
                        .addComponent(twoEleven)
                        .addComponent(twoTwelve)
                        .addComponent(twoThirteen)
                        .addComponent(twoFourteen)
                        .addComponent(twoFiveteen)
                        .addComponent(twoSixteen)
                        .addComponent(twoSeventeen)
                        .addComponent(twoEighteen)
                        .addComponent(twoNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(threeZero)
                        .addComponent(threeOne)
                        .addComponent(threeTwo)
                        .addComponent(threeThree)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(threeFour, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(threeFive)
                        .addComponent(threeSix)
                        .addComponent(threeSeven)
                        .addComponent(threeEight)
                        .addComponent(threeNine)
                        .addComponent(threeTen)
                        .addComponent(threeEleven)
                        .addComponent(threeTwelve)
                        .addComponent(threeThirteen)
                        .addComponent(threeFourteen)
                        .addComponent(threeFiveteen)
                        .addComponent(threeSixteen)
                        .addComponent(threeSeventeen)
                        .addComponent(threeEighteen)
                        .addComponent(threeNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fourZero)
                        .addComponent(fourOne)
                        .addComponent(fourTwo)
                        .addComponent(fourThree)
                        .addComponent(fourFour)
                        .addComponent(fourFive)
                        .addComponent(fourSix)
                        .addComponent(fourSeven)
                        .addComponent(fourEight)
                        .addComponent(fourNine)
                        .addComponent(fourTen)
                        .addComponent(fourEleven)
                        .addComponent(fourTwelve)
                        .addComponent(fourThirteen)
                        .addComponent(fourFourteen)
                        .addComponent(fourFiveteen)
                        .addComponent(fourSixteen)
                        .addComponent(fourSeventeen)
                        .addComponent(fourEighteen)
                        .addComponent(fourNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fiveZero)
                        .addComponent(fiveOne)
                        .addComponent(fiveTwo)
                        .addComponent(fiveThree)
                        .addComponent(fiveFour)
                        .addComponent(fiveFive)
                        .addComponent(fiveSix)
                        .addComponent(fiveSeven)
                        .addComponent(fiveEight)
                        .addComponent(fiveNine)
                        .addComponent(fiveTen)
                        .addComponent(fiveEleven)
                        .addComponent(fiveTwelve)
                        .addComponent(fiveThirteen)
                        .addComponent(fiveFourteen)
                        .addComponent(fiveFiveteen)
                        .addComponent(fiveSixteen)
                        .addComponent(fiveSeventeen)
                        .addComponent(fiveEighteen)
                        .addComponent(fiveNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sixZero)
                        .addComponent(sixOne)
                        .addComponent(sixTwo)
                        .addComponent(sixThree)
                        .addComponent(sixFour)
                        .addComponent(sixFive)
                        .addComponent(sixSix)
                        .addComponent(sixSeven)
                        .addComponent(sixEight)
                        .addComponent(sixNine)
                        .addComponent(sixTen)
                        .addComponent(sixEleven)
                        .addComponent(sixTwelve)
                        .addComponent(sixThirteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(sixFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(sixFiveteen)
                        .addComponent(sixSixteen)
                        .addComponent(sixSeventeen)
                        .addComponent(sixEighteen)
                        .addComponent(sixNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sevenZero)
                        .addComponent(sevenOne)
                        .addComponent(sevenTwo)
                        .addComponent(sevenThree)
                        .addComponent(sevenFour)
                        .addComponent(sevenFive)
                        .addComponent(sevenSix)
                        .addComponent(sevenSeven)
                        .addComponent(sevenEight)
                        .addComponent(sevenNine)
                        .addComponent(sevenTen)
                        .addComponent(sevenEleven)
                        .addComponent(sevenTwelve)
                        .addComponent(sevenThirteen)
                        .addComponent(sevenFourteen)
                        .addComponent(sevenFiveteen)
                        .addComponent(sevenSixteen)
                        .addComponent(sevenSeventeen)
                        .addComponent(sevenEighteen)
                        .addComponent(sevenNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eightZero)
                        .addComponent(eightOne)
                        .addComponent(eightTwo)
                        .addComponent(eightThree)
                        .addComponent(eightFour)
                        .addComponent(eightFive)
                        .addComponent(eightSix)
                        .addComponent(eightSeven)
                        .addComponent(eightEight)
                        .addComponent(eightNine)
                        .addComponent(eightTen)
                        .addComponent(eightEleven)
                        .addComponent(eightTwelve)
                        .addComponent(eightThirteen)
                        .addComponent(eightFourteen)
                        .addComponent(eightFiveteen)
                        .addComponent(eightSixteen)
                        .addComponent(eightSeventeen)
                        .addComponent(eighEighteen)
                        .addComponent(eightNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nineZero)
                        .addComponent(nineOne)
                        .addComponent(nineTwo)
                        .addComponent(nineThree)
                        .addComponent(nineFour)
                        .addComponent(nineFive)
                        .addComponent(nineSix)
                        .addComponent(nineSeven)
                        .addComponent(nineEight)
                        .addComponent(nineNine)
                        .addComponent(nineTen)
                        .addComponent(nineEleven)
                        .addComponent(nineTwelve)
                        .addComponent(nineThirteen)
                        .addComponent(nineFourteen)
                        .addComponent(nineFiveteen)
                        .addComponent(nineSixteen)
                        .addComponent(nineSeventeen)
                        .addComponent(nineEighteen)
                        .addComponent(nineNineteen))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tenSeven)
                        .addComponent(tenEight)
                        .addComponent(tenNine)
                        .addComponent(tenTen)
                        .addComponent(tenEleven)
                        .addComponent(tenTwelve)
                        .addComponent(tenThirteen)
                        .addComponent(tenFourteen)
                        .addComponent(tenFiveteen)
                        .addComponent(tenSixteen)
                        .addComponent(tenSeventeen)
                        .addComponent(tenEighteen)
                        .addComponent(tenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tenZero)
                                .addComponent(tenOne)
                                .addComponent(tenTwo)
                                .addComponent(tenThree)
                                .addComponent(tenFour)
                                .addComponent(tenFive)
                                .addComponent(tenSix))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(elevenSeven)
                        .addComponent(elevenEight)
                        .addComponent(elevenNine)
                        .addComponent(elevenTen)
                        .addComponent(elevenEleven)
                        .addComponent(elevenTwelve)
                        .addComponent(elevenThirteen)
                        .addComponent(elevenFourteen)
                        .addComponent(elevenFiveteen)
                        .addComponent(elevenSixteen)
                        .addComponent(elevenSeventeen)
                        .addComponent(elevenEighteen)
                        .addComponent(elevenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(elevenZero)
                                .addComponent(elevenOne)
                                .addComponent(elevenTwo)
                                .addComponent(elevenThree)
                                .addComponent(elevenFour)
                                .addComponent(elevenFive)
                                .addComponent(elevenSix))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(twelveSeven)
                        .addComponent(twelveEight)
                        .addComponent(twelveNine)
                        .addComponent(twelveTen)
                        .addComponent(twelveEleven)
                        .addComponent(twelveTwelve)
                        .addComponent(twelveThirteen)
                        .addComponent(twelveFourteen)
                        .addComponent(twelveFiveteen)
                        .addComponent(twelveSixteen)
                        .addComponent(twelveSeventeen)
                        .addComponent(twelveEighteen)
                        .addComponent(twelveNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(twelveZero)
                                .addComponent(twelveOne)
                                .addComponent(twelveTwo)
                                .addComponent(twelveThree)
                                .addComponent(twelveFour)
                                .addComponent(twelveFive)
                                .addComponent(twelveSix))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(thirteenSeven)
                        .addComponent(thirteenEight)
                        .addComponent(thirteenNine)
                        .addComponent(thirteenTen)
                        .addComponent(thirteenEleven)
                        .addComponent(thirteenTwelve)
                        .addComponent(thirteenThirteen)
                        .addComponent(thirteenFourteen)
                        .addComponent(thirteenFiveteen)
                        .addComponent(thirteenSixteen)
                        .addComponent(thirteenSeventeen)
                        .addComponent(thirteenEighteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(thirteenZero)
                                .addComponent(thirteenOne)
                                .addComponent(thirteenTwo)
                                .addComponent(thirteenThree)
                                .addComponent(thirteenFour)
                                .addComponent(thirteenFive)
                                .addComponent(thirteenSix)
                                .addComponent(thirteenNineteen))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fourteenFourteen)
                        .addComponent(fourteenFiveteen)
                        .addComponent(fourteenSixteen)
                        .addComponent(fourteenSeventeen)
                        .addComponent(fourteenEighteen)
                        .addComponent(fourteenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fourteenZero)
                                .addComponent(fourteenOne)
                                .addComponent(fourteenTwo)
                                .addComponent(fourteenThree)
                                .addComponent(fourteenFour)
                                .addComponent(fourteenFive)
                                .addComponent(fourteenSix)
                                .addComponent(fourteenSeven)
                                .addComponent(fourteenEight)
                                .addComponent(fourteenNine)
                                .addComponent(fourteenTen)
                                .addComponent(fourteenEleven)
                                .addComponent(fourteenTwelve)
                                .addComponent(fourteenThirteen))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fiveteenFourteen)
                        .addComponent(fiveteenFiveteen)
                        .addComponent(fiveteenSixteen)
                        .addComponent(fiveteenSeventeen)
                        .addComponent(fiveteenEighteen)
                        .addComponent(fiveteenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fiveteenZero)
                                .addComponent(fiveteenOne)
                                .addComponent(fiveteenTwo)
                                .addComponent(fiveteenThree)
                                .addComponent(fiveteenFour)
                                .addComponent(fiveteenFive)
                                .addComponent(fiveteenSix)
                                .addComponent(fiveteenSeven)
                                .addComponent(fiveteenEight)
                                .addComponent(fiveteenNine)
                                .addComponent(fiveteenTen)
                                .addComponent(fiveteenEleven)
                                .addComponent(fiveteenTwelve)
                                .addComponent(fiveteenThirteen))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sixteenFourteen)
                        .addComponent(sixteenFiveteen)
                        .addComponent(sixteenSixteen)
                        .addComponent(sixteenSeventeen)
                        .addComponent(sixteenEighteen)
                        .addComponent(sixteenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sixteenZero)
                                .addComponent(sixteenOne)
                                .addComponent(sixteenTwo)
                                .addComponent(sixteenThree)
                                .addComponent(sixteenFour)
                                .addComponent(sixteenFive)
                                .addComponent(sixteenSix)
                                .addComponent(sixteenSeven)
                                .addComponent(sixteenEight)
                                .addComponent(sixteenNine)
                                .addComponent(sixteenTen)
                                .addComponent(sixteenEleven)
                                .addComponent(sixteenTwelve)
                                .addComponent(sixteenThirteen))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seventeenFourteen)
                        .addComponent(seventeenFiveteen)
                        .addComponent(seventeenSixteen)
                        .addComponent(seventeenSeventeen)
                        .addComponent(seventeenEighteen)
                        .addComponent(seventeenNineteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seventeenZero)
                                .addComponent(seventeenOne)
                                .addComponent(seventeenTwo)
                                .addComponent(seventeenThree)
                                .addComponent(seventeenFour)
                                .addComponent(seventeenFive)
                                .addComponent(seventeenSix)
                                .addComponent(seventeenSeven)
                                .addComponent(seventeenEight)
                                .addComponent(seventeenNine)
                                .addComponent(seventeenTen)
                                .addComponent(seventeenEleven)
                                .addComponent(seventeenTwelve)
                                .addComponent(seventeenThirteen))))
                    .addGap(16, 16, 16)
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenZero))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenOne))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenTwo))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenThree))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenFour))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenFive))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenSix))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenSeven))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenEight))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenNine))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenTen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenEleven))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenTwelve))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(eighteenThirteen))
                        .addComponent(eighteenFourteen)
                        .addComponent(eighteenFiveteen)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(eighteenSixteen, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(eighteenSeventeen)
                        .addComponent(eighteenEighteen)
                        .addComponent(eighteenNineteen))
                    .addGroup(gridJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenZero))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenOne))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenTwo))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenThree))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenFour))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenFive))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenSix))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenSeven))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenEight))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenNine))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenTen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenTwelve))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(nineteenThirteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(nineteenFourteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(nineteenFiveteen, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(nineteenSixteen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(nineteenSeventeen))
                        .addGroup(gridJPanelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(nineteenEighteen)))
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        timerProcessingJButton.setText("jButton1");
        timerProcessingJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerProcessingJButtonActionPerformed(evt);
            }
        });

        startTimerJButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        startTimerJButton.setText("Start");
        startTimerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimerJButtonActionPerformed(evt);
            }
        });

        panelDescriptionJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelDescriptionJLabel.setText("Drone Simulation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timerProcessingJButton)
                    .addComponent(gridJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panelDescriptionJLabel)
                        .addGap(366, 366, 366)
                        .addComponent(startTimerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panelDescriptionJLabel)
                    .addComponent(startTimerJButton))
                .addGap(0, 0, 0)
                .addComponent(gridJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timerProcessingJButton)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timerProcessingJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerProcessingJButtonActionPerformed
        HashMap<String, Node> globalMap = graph.getGlobalMap();
        Drone drone = graph.getDrone();
        ArrayList<Node> pathFromSourceToDestination = drone.getPathFromSourceToDestination();
        ArrayList<Node> pathFromOriginalSourceToDestination = pathMap.get(drone.getSourceNode()).getFirst().getPathFromSourceToDestination();
        drone.getCfFromOriginalSourceToDestination().setNumberOfTimesPathTaken(drone.getCfFromOriginalSourceToDestination().getNumberOfTimesPathTaken() + 1);
        resetAnamolies(graph.getGlobalMap());
        createAnamolies(graph.getGlobalMap());
//        createAnamolyAtOneOne();
        Node currentNode = drone.getCurrentNode();
        System.out.println("Current Node is " + currentNode.getNodeName());
        if (machineIsLearning == false) {
            Node nextNode = pathFromSourceToDestination.get(currentIndexOfTheNode);
            System.out.println("Next node as per path is " + nextNode.getNodeName() + " and anamoly status is " + nextNode.isIsHighIntensityAnamolyPresent());;
            currentIndexOfTheNode++;
            if (nextNode.isIsHighIntensityAnamolyPresent() == false) {
//No anamoly present at next node so follow the current node                        
                updatingDroneNodes(currentNode, nextNode);
            } else {
                System.out.println("-----------------------------Pervious path stopped being followed since anamoly was detected-------------------------");
//Anamoly present at next node so change the path
//Check if the path is present in the dataset                
                LinkedList<ConfidenceFactor> listOfPaths = pathMap.get(currentNode);
                if (listOfPaths != null && drone.getCurrentNode() != drone.getSourceNode() && flag == false) {
                    System.out.println("Path for current node is already present in the dataset since machine learnt it before");
                    ConfidenceFactor cfFromSourceToDestination = listOfPaths.getLast();
                    cfFromSourceToDestination.setNumberOfTimesPathTaken(cfFromSourceToDestination.getNumberOfTimesPathTaken() + 1);
                    pathFromSourceToDestination = cfFromSourceToDestination.getPathFromSourceToDestination();
                    drone.setPathFromSourceToDestination(pathFromSourceToDestination);
                    currentIndexOfTheNode = 1;
                    nextNode = drone.getPathFromSourceToDestination().get(currentIndexOfTheNode);
                    System.out.println("Next node as per machine learnt path is " + nextNode.getNodeName());
                    currentIndexOfTheNode++;
                    if (nextNode.isIsHighIntensityAnamolyPresent() == false) {
                        updatingDroneNodes(currentNode, nextNode);
                    } else {
//Make machine learn                    
//Create a new path to reach destination since anamoly was detected                    
//                        createNewPathFromSourceToDestination(pathFromOriginalSourceToDestination);
                        createEntryInDataset(pathFromSourceToDestination, currentNode, nextNode);
                        machineIsLearning = true;
                    }
                } else if (listOfPaths != null && drone.getCurrentNode() == drone.getSourceNode()) {
//Anamoly found at node oneOne
//Make machine learn                    
//Create a new path to reach destination since anamoly was detected
                    System.out.println("Machine is learning since anamoly was detected at next node and there was no path already present in database");
                    System.out.println("-----------------------------------------------------------------Special Case---------------------------------------------------------------");
                    createEntryInDatasetForSpecialCase(drone.getPathFromSourceToDestination(), currentNode, nextNode);
                    machineIsLearning = true;
                    flag = true;
                } else {
//Make machine learn                    
//Create a new path to reach destination since anamoly was detected
                    if (flag == false) {
                        System.out.println("Machine is learning since anamoly was detected at next node and there was no path already present in database");
//                        createNewPathFromSourceToDestination(pathFromOriginalSourceToDestination);
                        createEntryInDataset(pathFromSourceToDestination, currentNode, nextNode);
                        machineIsLearning = true;
                    }
                }
            }
        } else if (machineIsLearning == true) {
            System.out.println("------------------------Machine is learning----------------------");
            Node nextNode = graph.getDrone().findNearestNodeToDestination();
            drone.getPathFromSourceToDestination().add(nextNode);
            System.out.println(nextNode.getNodeName() + " added to the new path");
        }
        if (drone.getCurrentNode().getNodeName().equals("nineteenNineteen")) {
            System.out.println("-----------------------Destination reached-------------------------------");
//            if (flag == false) {
////                fillNextHalfPath(pathFromSourceToDestination);
////                System.out.println("Next half of original path filled. The path that was traversed after an anamoly was detected");
//            } else {
//                pathMap.get(drone.getSourceNode()).removeLast();
//            }
            resetAnamolies(globalMap);
            System.out.println("------------------------------------------------------Current Dataset-------------------------------------------------------------");
            for (Node sourceNode : pathMap.keySet()) {
                System.out.println("------------------------Source Node is " + sourceNode.getNodeName() + "----------------------------------------------");
                LinkedList<ConfidenceFactor> listOfPaths = pathMap.get(sourceNode);
                for (ConfidenceFactor cf : listOfPaths) {
                    ArrayList<Node> currentPath = cf.getPathFromSourceToDestination();
                    for (Node node : currentPath) {
                        System.out.print(node.getNodeName() + "       ");
                    }
                    System.out.println("");
                }
                ListIterator<ConfidenceFactor> listIterator = listOfPaths.listIterator();
                System.out.println("-------------------------------------------------PATH-----------------------------------------------------------------------------");
            }
            flag = false;
            ConfidenceFactor cfFromSourceToDestination = new ConfidenceFactor();
            ArrayList<Node> pathFromSourceToDestination1 = new ArrayList<>();
            cfFromSourceToDestination.setPathFromSourceToDestination(pathFromSourceToDestination);
            drone.setCfFromSourceToDestination(cfFromSourceToDestination);

            for (int i = 0; i < 20; i++) {
                String xName = new Utility().numberToWords(i);
                String yName = xName.substring(0, 1).toUpperCase() + xName.substring(1);
                String nodeName = xName + yName;
                Node node = globalMap.get(nodeName);
                pathFromSourceToDestination1.add(node);
            }
            drone.setPathFromSourceToDestination(pathFromSourceToDestination1);
            timer.stop();
        }
    }//GEN-LAST:event_timerProcessingJButtonActionPerformed

    public void shufflePathsAsPerConfidenceFactor() {
        for (Node key : pathMap.keySet()) {
            LinkedList<ConfidenceFactor> cf = pathMap.get(key);
        }
    }

    public void resetNodesForNewTimer() {
        for (Component c : gridJPanel.getComponents()) {
            if (c instanceof JLabel) {
                if (c.getBackground().getGreen() == 255 || c.getBackground().getBlue() == 255) {
                    c.setBackground(Color.white);
                }
            }
        }
    }

    private void startTimerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimerJButtonActionPerformed
        resetNodesForNewTimer();
        graph.getDrone().setCurrentNode(graph.getDrone().getSourceNode());
        machineIsLearning = false;
        currentIndexOfTheNode = 1;
        System.out.println("----------------------------------------Original path is being followed----------------------------------------");
        timer.start();
    }//GEN-LAST:event_startTimerJButtonActionPerformed

    public void createNewPathFromSourceToDestination(ArrayList<Node> pathFromOriginalSourceToDestination) {
        Drone drone = graph.getDrone();
        ConfidenceFactor cfFromOriginalSourceToDestination = new ConfidenceFactor();
        cfFromOriginalSourceToDestination.setNumberOfTimesPathTaken(1);
        pathFromOriginalSourceToDestination = new ArrayList<>();
        System.out.println("New path created from original source to destination");
        cfFromOriginalSourceToDestination.setPathFromSourceToDestination(pathFromOriginalSourceToDestination);
        //Fill the first half path                    
        fillTheFirstHalfPath(drone.getPathFromOriginalSourceToDestination());
        System.out.println("Path was half filled with nodes already travelled");
        drone.setPathFromOriginalSourceToDestination(pathFromOriginalSourceToDestination);
        drone.setCfFromOriginalSourceToDestination(cfFromOriginalSourceToDestination);
    }

    public void createEntryInDataset(ArrayList<Node> pathFromSourceToDestination, Node currentNode, Node nextNode) {
        Drone drone = graph.getDrone();
        LinkedList<ConfidenceFactor> listOfPathFromTheSource;
        ConfidenceFactor cfFromSourceToDestination = new ConfidenceFactor();
        cfFromSourceToDestination.setNumberOfTimesPathTaken(1);
        if (pathMap.get(currentNode) == null) {
            listOfPathFromTheSource = new LinkedList<ConfidenceFactor>();
        } else {
            listOfPathFromTheSource = pathMap.get(currentNode);
        }
        pathFromSourceToDestination = new ArrayList<>();
        System.out.println("New path is created from current source to destination");
        cfFromSourceToDestination.setPathFromSourceToDestination(pathFromSourceToDestination);
        drone.setPathFromSourceToDestination(pathFromSourceToDestination);
        drone.setCfFromSourceToDestination(cfFromSourceToDestination);
        listOfPathFromTheSource.addLast(cfFromSourceToDestination);
        pathFromSourceToDestination.add(currentNode);
        System.out.println(currentNode.getNodeName() + " added to the path");
        nextNode = graph.getDrone().findNearestNodeToDestination();
        pathFromSourceToDestination.add(nextNode);
        System.out.println(nextNode.getNodeName() + " added to the path");
        pathMap.put(currentNode, listOfPathFromTheSource);
    }

    public void fillTheFirstHalfPath(ArrayList<Node> pathFromOriginalSourceToDestination) {
        Drone drone = graph.getDrone();
        for (Node node : pathMap.get(drone.getSourceNode()).getFirst().getPathFromSourceToDestination()) {
            System.out.println(node.getNodeName());
        }

//        for (Node node : pathMap.get(drone.getSourceNode()).getFirst().getPathFromSourceToDestination()) {
//            System.out.println(node.getNodeName());
//            if (!node.getNodeName().equals(drone.getCurrentNode().getNodeName())) {
//                pathFromOriginalSourceToDestination.add(node);
//            } else {
//                break;
//            }
//        }
//        for (Node node : pathMap.get(drone.getSourceNode()).getFirst().getPathFromSourceToDestination()) {
////        for (Node node : drone.getPathFromOriginalSourceToDestination()) {
//            if (node != drone.getCurrentNode()) {
//                pathFromOriginalSourceToDestination.add(node);
//            } else {
//                break;
//            }
//        }
    }

    public void fillNextHalfPath(ArrayList<Node> pathFromSourceToDestination) {
        Drone drone = graph.getDrone();
        if (pathFromSourceToDestination != null) {
            for (Node node : pathFromSourceToDestination) {
                drone.getPathFromOriginalSourceToDestination().add(node);
            }
            pathMap.get(drone.getSourceNode()).addLast(drone.getCfFromOriginalSourceToDestination());
            System.out.println("Original path added to dataset at source key");
            drone.setPathFromOriginalSourceToDestination(null);
        }
    }

    public void updatingDroneNodes(Node currentNode, Node nextNode) {
        Drone drone = graph.getDrone();
        drone.setCurrentNode(nextNode);
        drone.setPreviousNode(currentNode);
        drone.getPreviousNode().getLabel().setBackground(Color.blue);
        drone.getCurrentNode().getLabel().setBackground(Color.green);
    }

    public void createEntryInDatasetForSpecialCase(ArrayList<Node> pathFromSourceToDestination, Node currentNode, Node nextNode) {
        Drone drone = graph.getDrone();
//        LinkedList<ConfidenceFactor> listOfPathFromTheSource = pathMap.get(currentNode);;
//        ConfidenceFactor cfFromSourceToDestination = new ConfidenceFactor();
//        cfFromSourceToDestination.setNumberOfTimesPathTaken(1);
//        pathFromSourceToDestination = new ArrayList<>();
//        System.out.println("New path is created from original source to destination");
//        cfFromSourceToDestination.setPathFromSourceToDestination(pathFromSourceToDestination);
//        drone.setPathFromSourceToDestination(pathFromSourceToDestination);
//        drone.setCfFromSourceToDestination(cfFromSourceToDestination);
//        listOfPathFromTheSource.addLast(cfFromSourceToDestination);
//        pathFromSourceToDestination.add(currentNode);
//        System.out.println(currentNode.getNodeName() + " added to the path");
//        nextNode = graph.getDrone().findNearestNodeToDestination();
//        pathFromSourceToDestination.add(nextNode);
//        System.out.println(nextNode.getNodeName() + " added to the path");
////        pathMap.put(currentNode, listOfPathFromTheSource);
//        pathMap.get(drone.getSourceNode()).addLast(drone.getCfFromSourceToDestination());

        LinkedList<ConfidenceFactor> listOfPathFromTheSource = pathMap.get(currentNode);
        ConfidenceFactor cfFromSourceToDestination = new ConfidenceFactor();
        cfFromSourceToDestination.setNumberOfTimesPathTaken(1);
        pathFromSourceToDestination = new ArrayList<>();
        System.out.println("New path is created from original source to destination");
        cfFromSourceToDestination.setPathFromSourceToDestination(pathFromSourceToDestination);
        drone.setPathFromSourceToDestination(pathFromSourceToDestination);
        drone.setCfFromSourceToDestination(cfFromSourceToDestination);
        listOfPathFromTheSource.addLast(drone.getCfFromSourceToDestination());
        drone.getPathFromSourceToDestination().add(currentNode);
        System.out.println(currentNode.getNodeName() + " added to the path");
        nextNode = drone.findNearestNodeToDestination();
        drone.getPathFromSourceToDestination().add(nextNode);
        System.out.println(nextNode.getNodeName() + " added to the path");
//        pathMap.put(currentNode, listOfPathFromTheSource);
        pathMap.get(drone.getSourceNode()).addLast(drone.getCfFromSourceToDestination());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eighEighteen;
    private javax.swing.JLabel eightEight;
    private javax.swing.JLabel eightEleven;
    private javax.swing.JLabel eightFive;
    private javax.swing.JLabel eightFiveteen;
    private javax.swing.JLabel eightFour;
    private javax.swing.JLabel eightFourteen;
    private javax.swing.JLabel eightNine;
    private javax.swing.JLabel eightNineteen;
    private javax.swing.JLabel eightOne;
    private javax.swing.JLabel eightSeven;
    private javax.swing.JLabel eightSeventeen;
    private javax.swing.JLabel eightSix;
    private javax.swing.JLabel eightSixteen;
    private javax.swing.JLabel eightTen;
    private javax.swing.JLabel eightThirteen;
    private javax.swing.JLabel eightThree;
    private javax.swing.JLabel eightTwelve;
    private javax.swing.JLabel eightTwo;
    private javax.swing.JLabel eightZero;
    private javax.swing.JLabel eighteenEight;
    private javax.swing.JLabel eighteenEighteen;
    private javax.swing.JLabel eighteenEleven;
    private javax.swing.JLabel eighteenFive;
    private javax.swing.JLabel eighteenFiveteen;
    private javax.swing.JLabel eighteenFour;
    private javax.swing.JLabel eighteenFourteen;
    private javax.swing.JLabel eighteenNine;
    private javax.swing.JLabel eighteenNineteen;
    private javax.swing.JLabel eighteenOne;
    private javax.swing.JLabel eighteenSeven;
    private javax.swing.JLabel eighteenSeventeen;
    private javax.swing.JLabel eighteenSix;
    private javax.swing.JLabel eighteenSixteen;
    private javax.swing.JLabel eighteenTen;
    private javax.swing.JLabel eighteenThirteen;
    private javax.swing.JLabel eighteenThree;
    private javax.swing.JLabel eighteenTwelve;
    private javax.swing.JLabel eighteenTwo;
    private javax.swing.JLabel eighteenZero;
    private javax.swing.JLabel elevenEight;
    private javax.swing.JLabel elevenEighteen;
    private javax.swing.JLabel elevenEleven;
    private javax.swing.JLabel elevenFive;
    private javax.swing.JLabel elevenFiveteen;
    private javax.swing.JLabel elevenFour;
    private javax.swing.JLabel elevenFourteen;
    private javax.swing.JLabel elevenNine;
    private javax.swing.JLabel elevenNineteen;
    private javax.swing.JLabel elevenOne;
    private javax.swing.JLabel elevenSeven;
    private javax.swing.JLabel elevenSeventeen;
    private javax.swing.JLabel elevenSix;
    private javax.swing.JLabel elevenSixteen;
    private javax.swing.JLabel elevenTen;
    private javax.swing.JLabel elevenThirteen;
    private javax.swing.JLabel elevenThree;
    private javax.swing.JLabel elevenTwelve;
    private javax.swing.JLabel elevenTwo;
    private javax.swing.JLabel elevenZero;
    private javax.swing.JLabel fiveEight;
    private javax.swing.JLabel fiveEighteen;
    private javax.swing.JLabel fiveEleven;
    private javax.swing.JLabel fiveFive;
    private javax.swing.JLabel fiveFiveteen;
    private javax.swing.JLabel fiveFour;
    private javax.swing.JLabel fiveFourteen;
    private javax.swing.JLabel fiveNine;
    private javax.swing.JLabel fiveNineteen;
    private javax.swing.JLabel fiveOne;
    private javax.swing.JLabel fiveSeven;
    private javax.swing.JLabel fiveSeventeen;
    private javax.swing.JLabel fiveSix;
    private javax.swing.JLabel fiveSixteen;
    private javax.swing.JLabel fiveTen;
    private javax.swing.JLabel fiveThirteen;
    private javax.swing.JLabel fiveThree;
    private javax.swing.JLabel fiveTwelve;
    private javax.swing.JLabel fiveTwo;
    private javax.swing.JLabel fiveZero;
    private javax.swing.JLabel fiveteenEight;
    private javax.swing.JLabel fiveteenEighteen;
    private javax.swing.JLabel fiveteenEleven;
    private javax.swing.JLabel fiveteenFive;
    private javax.swing.JLabel fiveteenFiveteen;
    private javax.swing.JLabel fiveteenFour;
    private javax.swing.JLabel fiveteenFourteen;
    private javax.swing.JLabel fiveteenNine;
    private javax.swing.JLabel fiveteenNineteen;
    private javax.swing.JLabel fiveteenOne;
    private javax.swing.JLabel fiveteenSeven;
    private javax.swing.JLabel fiveteenSeventeen;
    private javax.swing.JLabel fiveteenSix;
    private javax.swing.JLabel fiveteenSixteen;
    private javax.swing.JLabel fiveteenTen;
    private javax.swing.JLabel fiveteenThirteen;
    private javax.swing.JLabel fiveteenThree;
    private javax.swing.JLabel fiveteenTwelve;
    private javax.swing.JLabel fiveteenTwo;
    private javax.swing.JLabel fiveteenZero;
    private javax.swing.JLabel fourEight;
    private javax.swing.JLabel fourEighteen;
    private javax.swing.JLabel fourEleven;
    private javax.swing.JLabel fourFive;
    private javax.swing.JLabel fourFiveteen;
    private javax.swing.JLabel fourFour;
    private javax.swing.JLabel fourFourteen;
    private javax.swing.JLabel fourNine;
    private javax.swing.JLabel fourNineteen;
    private javax.swing.JLabel fourOne;
    private javax.swing.JLabel fourSeven;
    private javax.swing.JLabel fourSeventeen;
    private javax.swing.JLabel fourSix;
    private javax.swing.JLabel fourSixteen;
    private javax.swing.JLabel fourTen;
    private javax.swing.JLabel fourThirteen;
    private javax.swing.JLabel fourThree;
    private javax.swing.JLabel fourTwelve;
    private javax.swing.JLabel fourTwo;
    private javax.swing.JLabel fourZero;
    private javax.swing.JLabel fourteenEight;
    private javax.swing.JLabel fourteenEighteen;
    private javax.swing.JLabel fourteenEleven;
    private javax.swing.JLabel fourteenFive;
    private javax.swing.JLabel fourteenFiveteen;
    private javax.swing.JLabel fourteenFour;
    private javax.swing.JLabel fourteenFourteen;
    private javax.swing.JLabel fourteenNine;
    private javax.swing.JLabel fourteenNineteen;
    private javax.swing.JLabel fourteenOne;
    private javax.swing.JLabel fourteenSeven;
    private javax.swing.JLabel fourteenSeventeen;
    private javax.swing.JLabel fourteenSix;
    private javax.swing.JLabel fourteenSixteen;
    private javax.swing.JLabel fourteenTen;
    private javax.swing.JLabel fourteenThirteen;
    private javax.swing.JLabel fourteenThree;
    private javax.swing.JLabel fourteenTwelve;
    private javax.swing.JLabel fourteenTwo;
    private javax.swing.JLabel fourteenZero;
    private javax.swing.JPanel gridJPanel;
    private javax.swing.JLabel nineEight;
    private javax.swing.JLabel nineEighteen;
    private javax.swing.JLabel nineEleven;
    private javax.swing.JLabel nineFive;
    private javax.swing.JLabel nineFiveteen;
    private javax.swing.JLabel nineFour;
    private javax.swing.JLabel nineFourteen;
    private javax.swing.JLabel nineNine;
    private javax.swing.JLabel nineNineteen;
    private javax.swing.JLabel nineOne;
    private javax.swing.JLabel nineSeven;
    private javax.swing.JLabel nineSeventeen;
    private javax.swing.JLabel nineSix;
    private javax.swing.JLabel nineSixteen;
    private javax.swing.JLabel nineTen;
    private javax.swing.JLabel nineThirteen;
    private javax.swing.JLabel nineThree;
    private javax.swing.JLabel nineTwelve;
    private javax.swing.JLabel nineTwo;
    private javax.swing.JLabel nineZero;
    private javax.swing.JLabel nineteenEight;
    private javax.swing.JLabel nineteenEighteen;
    private javax.swing.JLabel nineteenEleven;
    private javax.swing.JLabel nineteenFive;
    private javax.swing.JLabel nineteenFiveteen;
    private javax.swing.JLabel nineteenFour;
    private javax.swing.JLabel nineteenFourteen;
    private javax.swing.JLabel nineteenNine;
    private javax.swing.JLabel nineteenNineteen;
    private javax.swing.JLabel nineteenOne;
    private javax.swing.JLabel nineteenSeven;
    private javax.swing.JLabel nineteenSeventeen;
    private javax.swing.JLabel nineteenSix;
    private javax.swing.JLabel nineteenSixteen;
    private javax.swing.JLabel nineteenTen;
    private javax.swing.JLabel nineteenThirteen;
    private javax.swing.JLabel nineteenThree;
    private javax.swing.JLabel nineteenTwelve;
    private javax.swing.JLabel nineteenTwo;
    private javax.swing.JLabel nineteenZero;
    private javax.swing.JLabel oneEight;
    private javax.swing.JLabel oneEighteen;
    private javax.swing.JLabel oneEleven;
    private javax.swing.JLabel oneFive;
    private javax.swing.JLabel oneFiveteen;
    private javax.swing.JLabel oneFour;
    private javax.swing.JLabel oneFourteen;
    private javax.swing.JLabel oneNine;
    private javax.swing.JLabel oneNineteen;
    private javax.swing.JLabel oneOne;
    private javax.swing.JLabel oneSeven;
    private javax.swing.JLabel oneSeventeen;
    private javax.swing.JLabel oneSix;
    private javax.swing.JLabel oneSixteen;
    private javax.swing.JLabel oneTen;
    private javax.swing.JLabel oneThirteen;
    private javax.swing.JLabel oneThree;
    private javax.swing.JLabel oneTwelve;
    private javax.swing.JLabel oneTwo;
    private javax.swing.JLabel oneZero;
    private javax.swing.JLabel panelDescriptionJLabel;
    private javax.swing.JLabel sevenEight;
    private javax.swing.JLabel sevenEighteen;
    private javax.swing.JLabel sevenEleven;
    private javax.swing.JLabel sevenFive;
    private javax.swing.JLabel sevenFiveteen;
    private javax.swing.JLabel sevenFour;
    private javax.swing.JLabel sevenFourteen;
    private javax.swing.JLabel sevenNine;
    private javax.swing.JLabel sevenNineteen;
    private javax.swing.JLabel sevenOne;
    private javax.swing.JLabel sevenSeven;
    private javax.swing.JLabel sevenSeventeen;
    private javax.swing.JLabel sevenSix;
    private javax.swing.JLabel sevenSixteen;
    private javax.swing.JLabel sevenTen;
    private javax.swing.JLabel sevenThirteen;
    private javax.swing.JLabel sevenThree;
    private javax.swing.JLabel sevenTwelve;
    private javax.swing.JLabel sevenTwo;
    private javax.swing.JLabel sevenZero;
    private javax.swing.JLabel seventeenEight;
    private javax.swing.JLabel seventeenEighteen;
    private javax.swing.JLabel seventeenEleven;
    private javax.swing.JLabel seventeenFive;
    private javax.swing.JLabel seventeenFiveteen;
    private javax.swing.JLabel seventeenFour;
    private javax.swing.JLabel seventeenFourteen;
    private javax.swing.JLabel seventeenNine;
    private javax.swing.JLabel seventeenNineteen;
    private javax.swing.JLabel seventeenOne;
    private javax.swing.JLabel seventeenSeven;
    private javax.swing.JLabel seventeenSeventeen;
    private javax.swing.JLabel seventeenSix;
    private javax.swing.JLabel seventeenSixteen;
    private javax.swing.JLabel seventeenTen;
    private javax.swing.JLabel seventeenThirteen;
    private javax.swing.JLabel seventeenThree;
    private javax.swing.JLabel seventeenTwelve;
    private javax.swing.JLabel seventeenTwo;
    private javax.swing.JLabel seventeenZero;
    private javax.swing.JLabel sixEight;
    private javax.swing.JLabel sixEighteen;
    private javax.swing.JLabel sixEleven;
    private javax.swing.JLabel sixFive;
    private javax.swing.JLabel sixFiveteen;
    private javax.swing.JLabel sixFour;
    private javax.swing.JLabel sixFourteen;
    private javax.swing.JLabel sixNine;
    private javax.swing.JLabel sixNineteen;
    private javax.swing.JLabel sixOne;
    private javax.swing.JLabel sixSeven;
    private javax.swing.JLabel sixSeventeen;
    private javax.swing.JLabel sixSix;
    private javax.swing.JLabel sixSixteen;
    private javax.swing.JLabel sixTen;
    private javax.swing.JLabel sixThirteen;
    private javax.swing.JLabel sixThree;
    private javax.swing.JLabel sixTwelve;
    private javax.swing.JLabel sixTwo;
    private javax.swing.JLabel sixZero;
    private javax.swing.JLabel sixteenEight;
    private javax.swing.JLabel sixteenEighteen;
    private javax.swing.JLabel sixteenEleven;
    private javax.swing.JLabel sixteenFive;
    private javax.swing.JLabel sixteenFiveteen;
    private javax.swing.JLabel sixteenFour;
    private javax.swing.JLabel sixteenFourteen;
    private javax.swing.JLabel sixteenNine;
    private javax.swing.JLabel sixteenNineteen;
    private javax.swing.JLabel sixteenOne;
    private javax.swing.JLabel sixteenSeven;
    private javax.swing.JLabel sixteenSeventeen;
    private javax.swing.JLabel sixteenSix;
    private javax.swing.JLabel sixteenSixteen;
    private javax.swing.JLabel sixteenTen;
    private javax.swing.JLabel sixteenThirteen;
    private javax.swing.JLabel sixteenThree;
    private javax.swing.JLabel sixteenTwelve;
    private javax.swing.JLabel sixteenTwo;
    private javax.swing.JLabel sixteenZero;
    private javax.swing.JButton startTimerJButton;
    private javax.swing.JLabel tenEight;
    private javax.swing.JLabel tenEighteen;
    private javax.swing.JLabel tenEleven;
    private javax.swing.JLabel tenFive;
    private javax.swing.JLabel tenFiveteen;
    private javax.swing.JLabel tenFour;
    private javax.swing.JLabel tenFourteen;
    private javax.swing.JLabel tenNine;
    private javax.swing.JLabel tenNineteen;
    private javax.swing.JLabel tenOne;
    private javax.swing.JLabel tenSeven;
    private javax.swing.JLabel tenSeventeen;
    private javax.swing.JLabel tenSix;
    private javax.swing.JLabel tenSixteen;
    private javax.swing.JLabel tenTen;
    private javax.swing.JLabel tenThirteen;
    private javax.swing.JLabel tenThree;
    private javax.swing.JLabel tenTwelve;
    private javax.swing.JLabel tenTwo;
    private javax.swing.JLabel tenZero;
    private javax.swing.JLabel thirteenEight;
    private javax.swing.JLabel thirteenEighteen;
    private javax.swing.JLabel thirteenEleven;
    private javax.swing.JLabel thirteenFive;
    private javax.swing.JLabel thirteenFiveteen;
    private javax.swing.JLabel thirteenFour;
    private javax.swing.JLabel thirteenFourteen;
    private javax.swing.JLabel thirteenNine;
    private javax.swing.JLabel thirteenNineteen;
    private javax.swing.JLabel thirteenOne;
    private javax.swing.JLabel thirteenSeven;
    private javax.swing.JLabel thirteenSeventeen;
    private javax.swing.JLabel thirteenSix;
    private javax.swing.JLabel thirteenSixteen;
    private javax.swing.JLabel thirteenTen;
    private javax.swing.JLabel thirteenThirteen;
    private javax.swing.JLabel thirteenThree;
    private javax.swing.JLabel thirteenTwelve;
    private javax.swing.JLabel thirteenTwo;
    private javax.swing.JLabel thirteenZero;
    private javax.swing.JLabel threeEight;
    private javax.swing.JLabel threeEighteen;
    private javax.swing.JLabel threeEleven;
    private javax.swing.JLabel threeFive;
    private javax.swing.JLabel threeFiveteen;
    private javax.swing.JLabel threeFour;
    private javax.swing.JLabel threeFourteen;
    private javax.swing.JLabel threeNine;
    private javax.swing.JLabel threeNineteen;
    private javax.swing.JLabel threeOne;
    private javax.swing.JLabel threeSeven;
    private javax.swing.JLabel threeSeventeen;
    private javax.swing.JLabel threeSix;
    private javax.swing.JLabel threeSixteen;
    private javax.swing.JLabel threeTen;
    private javax.swing.JLabel threeThirteen;
    private javax.swing.JLabel threeThree;
    private javax.swing.JLabel threeTwelve;
    private javax.swing.JLabel threeTwo;
    private javax.swing.JLabel threeZero;
    private javax.swing.JButton timerProcessingJButton;
    private javax.swing.JLabel twelveEight;
    private javax.swing.JLabel twelveEighteen;
    private javax.swing.JLabel twelveEleven;
    private javax.swing.JLabel twelveFive;
    private javax.swing.JLabel twelveFiveteen;
    private javax.swing.JLabel twelveFour;
    private javax.swing.JLabel twelveFourteen;
    private javax.swing.JLabel twelveNine;
    private javax.swing.JLabel twelveNineteen;
    private javax.swing.JLabel twelveOne;
    private javax.swing.JLabel twelveSeven;
    private javax.swing.JLabel twelveSeventeen;
    private javax.swing.JLabel twelveSix;
    private javax.swing.JLabel twelveSixteen;
    private javax.swing.JLabel twelveTen;
    private javax.swing.JLabel twelveThirteen;
    private javax.swing.JLabel twelveThree;
    private javax.swing.JLabel twelveTwelve;
    private javax.swing.JLabel twelveTwo;
    private javax.swing.JLabel twelveZero;
    private javax.swing.JLabel twoEight;
    private javax.swing.JLabel twoEighteen;
    private javax.swing.JLabel twoEleven;
    private javax.swing.JLabel twoFive;
    private javax.swing.JLabel twoFiveteen;
    private javax.swing.JLabel twoFour;
    private javax.swing.JLabel twoFourteen;
    private javax.swing.JLabel twoNine;
    private javax.swing.JLabel twoNineteen;
    private javax.swing.JLabel twoOne;
    private javax.swing.JLabel twoSeven;
    private javax.swing.JLabel twoSeventeen;
    private javax.swing.JLabel twoSix;
    private javax.swing.JLabel twoSixteen;
    private javax.swing.JLabel twoTen;
    private javax.swing.JLabel twoThirteen;
    private javax.swing.JLabel twoThree;
    private javax.swing.JLabel twoTwelve;
    private javax.swing.JLabel twoTwo;
    private javax.swing.JLabel twoZero;
    private javax.swing.JLabel zeroEight;
    private javax.swing.JLabel zeroEighteen;
    private javax.swing.JLabel zeroEleven;
    private javax.swing.JLabel zeroFive;
    private javax.swing.JLabel zeroFiveteen;
    private javax.swing.JLabel zeroFour;
    private javax.swing.JLabel zeroFourteen;
    private javax.swing.JLabel zeroNine;
    private javax.swing.JLabel zeroNineteen;
    private javax.swing.JLabel zeroOne;
    private javax.swing.JLabel zeroSeven;
    private javax.swing.JLabel zeroSeventeen;
    private javax.swing.JLabel zeroSix;
    private javax.swing.JLabel zeroSixteen;
    private javax.swing.JLabel zeroTen;
    private javax.swing.JLabel zeroThirteen;
    private javax.swing.JLabel zeroThree;
    private javax.swing.JLabel zeroTwelve;
    private javax.swing.JLabel zeroTwo;
    private javax.swing.JLabel zeroZero;
    // End of variables declaration//GEN-END:variables
}
