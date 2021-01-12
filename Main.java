class Main {
  public static void main(String[] args) {
    System.out.println("***The Meteo***");
    MeteoData md=new MeteoData();
    ConditionDisplay ac=new ConditionDisplay(md);
    md.setMesures(20,45,1450);
    md.setMesures(15,55,1300);
    md.setMesures(13,30,1800);
  }
}