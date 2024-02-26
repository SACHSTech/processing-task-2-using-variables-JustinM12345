import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400,400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(117, 234, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff

    // Draw Head
    fill(255,255,0);
    ellipse(width / 2, 80, 100, 100);

    // Draw Body
    fill(0);
    rect((width / 2) - 5, 130, 10, 100);

    // Draw Legs
    stroke(0);
    line(height / 2, 230, 150, 300);
    line(height / 2, 230, 250, 300);

    // Draw Arms
    line(height / 2, 180, 150, 200);
    line(height / 2, 180, 250, 150);

    // Draw Sun
    fill(255, 255, 0);
    ellipse(0, 0, 100, 100);

    // Foreground grass
    fill(0, 200, 0);
    rect(0, (3 * height) / 4, 400, 100);
  }
}