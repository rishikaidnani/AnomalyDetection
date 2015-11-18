/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Rishika Idnani
 */
public class Node {

    private String nodeName;
    private String xName;
    private String yName;
    private boolean isAnamolyPresent;
    private boolean isLowIntensityAnamolyPresent;
    private boolean isHighIntensityAnamolyPresent;
    private JLabel label;

    public Node() {
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName() {
        this.nodeName = xName + yName;
    }

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public String getyName() {
        return yName;
    }

    public void setyName(String yName) {
        this.yName = yName;
    }

    public boolean isIsAnamolyPresent() {
        return isAnamolyPresent;
    }

    public void setIsAnamolyPresent(boolean isAnamolyPresent) {
        this.isAnamolyPresent = isAnamolyPresent;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public boolean isIsLowIntensityAnamolyPresent() {
        return isLowIntensityAnamolyPresent;
    }

    public void setIsLowIntensityAnamolyPresent(boolean isLowIntensityAnamolyPresent) {
        this.isLowIntensityAnamolyPresent = isLowIntensityAnamolyPresent;
    }

    public boolean isIsHighIntensityAnamolyPresent() {
        return isHighIntensityAnamolyPresent;
    }

    public void setIsHighIntensityAnamolyPresent(boolean isHighIntensityAnamolyPresent) {
        this.isHighIntensityAnamolyPresent = isHighIntensityAnamolyPresent;
    }

}
