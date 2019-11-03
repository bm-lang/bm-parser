package bm.parser.target.instructions;

import bm.parser.target.expressions.GExpression;

public class GThrow extends GInstruction {

  private GExpression error;

  public GExpression getError() {
    return error;
  }

  public void setError(GExpression error) {
    this.error = error;
  }
}
