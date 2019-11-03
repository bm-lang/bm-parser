package bm.parser.target;

public class GChainedConstructor {

    private GMemberRef constructor;
    private GParameterList parameters;

    // getters & setters

    public GMemberRef getConstructor() {
        return constructor;
    }

    public void setConstructor(GMemberRef constructor) {
        this.constructor = constructor;
    }

    public GParameterList getParameters() {
        return parameters;
    }

    public void setParameters(GParameterList parameters) {
        this.parameters = parameters;
    }
}
