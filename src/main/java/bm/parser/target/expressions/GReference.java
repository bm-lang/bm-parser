package bm.parser.target.expressions;

public class GReference extends GReferenceBase {

    private GSubreferenceList subreferences;
    private GExpressionList indexes;

    // getters & setters

    public GSubreferenceList getSubreferences() {
        return subreferences;
    }

    public void setSubreferences(GSubreferenceList subreferences) {
        this.subreferences = subreferences;
    }

    public GExpressionList getIndexes() {
        return indexes;
    }

    public void setIndexes(GExpressionList indexes) {
        this.indexes = indexes;
    }
}
