package bm.parser.target.instructions;

import bm.parser.target.expressions.PExpression;

public class PThrow extends PInstruction {

  private PExpression error;

  public PExpression getError() {
    return error;
  }

  public void setError(PExpression error) {
    this.error = error;
  }
}
