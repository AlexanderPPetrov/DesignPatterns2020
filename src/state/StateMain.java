package state;

public class StateMain {

	public static void main(String[] args) {

		Context player = new Context("Hero");
		Context enemy = new Context("Boss 01");
		
		StartState startState = new StartState();
		StopState stopState = new StopState();
		
		startState.applyState(player);
		stopState.applyState(enemy);
		
		State playerState = player.getState();
		String currentState = playerState.getStateName();
		System.out.println("currentState: " + currentState);
			
	}

}
