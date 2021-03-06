package adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
	private OldCoffeeMachine oldVendingMachine;

	@Override
	public void chooseFirstSelection() {
		oldVendingMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldVendingMachine.selectB();		
	}
	
	public void connect(OldCoffeeMachine oldMachine) {
		this.oldVendingMachine = oldMachine;
	}

}
