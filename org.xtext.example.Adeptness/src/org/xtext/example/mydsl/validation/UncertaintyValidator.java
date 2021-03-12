
package org.xtext.example.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.adeptness.Signal;

public class UncertaintyValidator extends AbstractAdeptnessValidator{
	@Check
	public void validateSomething(Signal CPS) {
		System.out.println("From uncertainty validator");
	}
}