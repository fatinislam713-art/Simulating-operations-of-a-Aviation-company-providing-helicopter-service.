package cse213.helicopterservice.TechnicalEngineer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PerformanceFeedback {
    private String suggestionType;
    private String suggestionDetails;
    private String toolFeedback;
    private String systemReview;
    private String repeatedFault;
    private String trainingRecommendation;
    private String upgradePlan;
    private String safetyMeetingInput;
    @javafx.fxml.FXML
    private TextArea suggestionArea;
    @javafx.fxml.FXML
    private TextField partOrSystemField;
    @javafx.fxml.FXML
    private ComboBox suggestionTypeCombo;

    public PerformanceFeedback(String suggestionType, String suggestionDetails, String toolFeedback, String systemReview, String repeatedFault, String trainingRecommendation, String upgradePlan, String safetyMeetingInput) {
        this.suggestionType = suggestionType;
        this.suggestionDetails = suggestionDetails;
        this.toolFeedback = toolFeedback;
        this.systemReview = systemReview;
        this.repeatedFault = repeatedFault;
        this.trainingRecommendation = trainingRecommendation;
        this.upgradePlan = upgradePlan;
        this.safetyMeetingInput = safetyMeetingInput;
    }

    public String getSuggestionType() {
        return suggestionType;
    }

    public void setSuggestionType(String suggestionType) {
        this.suggestionType = suggestionType;
    }

    public String getSuggestionDetails() {
        return suggestionDetails;
    }

    public void setSuggestionDetails(String suggestionDetails) {
        this.suggestionDetails = suggestionDetails;
    }

    public String getToolFeedback() {
        return toolFeedback;
    }

    public void setToolFeedback(String toolFeedback) {
        this.toolFeedback = toolFeedback;
    }

    public String getSystemReview() {
        return systemReview;
    }

    public void setSystemReview(String systemReview) {
        this.systemReview = systemReview;
    }

    public String getRepeatedFault() {
        return repeatedFault;
    }

    public void setRepeatedFault(String repeatedFault) {
        this.repeatedFault = repeatedFault;
    }

    public String getTrainingRecommendation() {
        return trainingRecommendation;
    }

    public void setTrainingRecommendation(String trainingRecommendation) {
        this.trainingRecommendation = trainingRecommendation;
    }

    public String getUpgradePlan() {
        return upgradePlan;
    }

    public void setUpgradePlan(String upgradePlan) {
        this.upgradePlan = upgradePlan;
    }

    public String getSafetyMeetingInput() {
        return safetyMeetingInput;
    }

    public void setSafetyMeetingInput(String safetyMeetingInput) {
        this.safetyMeetingInput = safetyMeetingInput;
    }

    @Override
    public String toString() {
        return "PerformanceFeedback{" +
                "suggestionType='" + suggestionType + '\'' +
                ", suggestionDetails='" + suggestionDetails + '\'' +
                ", toolFeedback='" + toolFeedback + '\'' +
                ", systemReview='" + systemReview + '\'' +
                ", repeatedFault='" + repeatedFault + '\'' +
                ", trainingRecommendation='" + trainingRecommendation + '\'' +
                ", upgradePlan='" + upgradePlan + '\'' +
                ", safetyMeetingInput='" + safetyMeetingInput + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void handleSuggestTrainingBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePlanUpgradeBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSubmitFeedbackBtn(ActionEvent actionEvent) {
    }
}
