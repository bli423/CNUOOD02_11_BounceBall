package Division;

public class Collision {
	public void check(Ball ball, GameObject[] gameObjs) {
		for(int i = 0; i < gameObjs.length; i++)
			if(isCollided(ball, gameObjs[i])) gameObjs[i].collisionCheck(ball);
	}
	private boolean isCollided(Ball ball, GameObject gameObj) {
		if(gameObj instanceof Land)
			return caseLand(ball, gameObj);
		else if(gameObj instanceof FadeWall)
			return caseFadeWall(ball, gameObj);
		else if(gameObj instanceof Needle)
			return caseNeedle(ball, gameObj);
		else if(gameObj instanceof Schanze)
			return caseSchanze(ball, gameObj);
		else if(gameObj instanceof Portal)
			return casePortal(ball, gameObj);
		else
			return false;		
	}
	private boolean caseLand(Ball ball, GameObject gameObj) {
		
	}
	private boolean caseSchanze(Ball ball, GameObject gameObj) {
		
	}
	private boolean caseFadeWall(Ball ball, GameObject gameObj) {
		
	}
	private boolean caseNeedle(Ball ball, GameObject gameObj) {
		
	}
	private boolean casePortal(Ball ball, GameObject gameObj) {
		
	}
}
