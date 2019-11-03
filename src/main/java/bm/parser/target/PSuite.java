package bm.parser.target;

import java.util.List;

public class PSuite {

  private final String name;
  private final List<PSourceFile> sourceFiles;

  public PSuite(String name, List<PSourceFile> sourceFiles) {
    this.name = name;
    this.sourceFiles = sourceFiles;
  }

  public String getName() {
    return name;
  }

  public List<PSourceFile> getSourceFiles() {
    return sourceFiles;
  }

}
