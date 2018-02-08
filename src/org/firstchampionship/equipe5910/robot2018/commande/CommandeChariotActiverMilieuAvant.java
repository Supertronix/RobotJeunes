package org.firstchampionship.equipe5910.robot2018.commande;

import org.firstchampionship.equipe5910.robot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CommandeChariotActiverMilieuAvant extends Command{
	
	public CommandeChariotActiverMilieuAvant(){
		requires(Robot.chariot);
	}
	
	@Override
	protected void initialize() {
		System.out.println("CommandeChariotActiverMilieuAvant");
		Robot.chariot.positionnerMilieuAvant();
	}
	
	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
	
	
}
