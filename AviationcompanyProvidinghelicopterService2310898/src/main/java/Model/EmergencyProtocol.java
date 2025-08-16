package Model;

public class EmergencyProtocol {
    private String protocolName;
    private String instructions;

    public EmergencyProtocol(String protocolName, String instructions) {
        this.protocolName = protocolName;
        this.instructions = instructions;
    }

    public String getProtocolName() { return protocolName; }
    public void setProtocolName(String protocolName) { this.protocolName = protocolName; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }

    @Override
    public String toString() {
        return "Protocol: " + protocolName + " - " + instructions;
    }
}

