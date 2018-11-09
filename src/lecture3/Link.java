package lecture3;

class Link extends Object{

  String value;
  Link next;

  public Link(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    String r = value;
    if (next != null) {
      r += " " + next;
    }
    return r;
  }
}
