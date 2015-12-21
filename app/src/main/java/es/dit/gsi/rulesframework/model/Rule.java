package es.dit.gsi.rulesframework.model;

/**
 * Created by afernandez on 23/10/15.
 */
public class Rule{

    private int id;
    private String ruleName;
    private String ifElement;
    private String ifAction;
    private String doElement;
    private String doAction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIfElement() {
        return ifElement;
    }

    public void setIfElement(String ifElement) {
        this.ifElement = ifElement;
    }

    public String getIfAction() {
        return ifAction;
    }

    public void setIfAction(String ifAction) {
        this.ifAction = ifAction;
    }

    public String getDoElement() {
        return doElement;
    }

    public void setDoElement(String doElement) {
        this.doElement = doElement;
    }

    public String getDoAction() {
        return doAction;
    }

    public void setDoAction(String doAction) {
        this.doAction = doAction;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public Rule(String ruleName, String ifElement, String ifAction, String doElement, String doAction) {
        this.ruleName = ruleName;

        this.ifElement = ifElement;
        this.ifAction = ifAction;
        this.doAction = doAction;
        this.doElement = doElement;
    }
    public Rule (){}
    public String getFullRule(){
        return "IF " + ifElement + " " + ifAction + " -> DO " + doElement + " " + doAction + "\n";
    }
}