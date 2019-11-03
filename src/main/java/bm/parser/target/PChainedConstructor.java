package bm.parser.target;

public class PChainedConstructor {

    private PMemberRef constructor;
    private PParameterList parameters;

    // getters & setters

    public PMemberRef getConstructor() {
        return constructor;
    }

    public void setConstructor(PMemberRef constructor) {
        this.constructor = constructor;
    }

    public PParameterList getParameters() {
        return parameters;
    }

    public void setParameters(PParameterList parameters) {
        this.parameters = parameters;
    }
}
