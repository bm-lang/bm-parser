package bm.parser.target.expressions;

public class PReference extends PReferenceBase {

    private PSubreferenceList subreferences;
    private PExpressionList indexes;

    // getters & setters

    public PSubreferenceList getSubreferences() {
        return subreferences;
    }

    public void setSubreferences(PSubreferenceList subreferences) {
        this.subreferences = subreferences;
    }

    public PExpressionList getIndexes() {
        return indexes;
    }

    public void setIndexes(PExpressionList indexes) {
        this.indexes = indexes;
    }
}
