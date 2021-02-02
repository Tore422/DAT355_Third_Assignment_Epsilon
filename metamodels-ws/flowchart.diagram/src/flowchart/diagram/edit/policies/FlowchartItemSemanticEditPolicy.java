/*
* 
*/
package flowchart.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import flowchart.diagram.edit.commands.AssignmentCreateCommand;
import flowchart.diagram.edit.commands.DecisionCreateCommand;
import flowchart.diagram.edit.commands.EventCreateCommand;
import flowchart.diagram.edit.commands.InputCreateCommand;
import flowchart.diagram.edit.commands.OutputCreateCommand;
import flowchart.diagram.providers.FlowchartElementTypes;

/**
 * @generated
 */
public class FlowchartItemSemanticEditPolicy extends FlowchartBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FlowchartItemSemanticEditPolicy() {
		super(FlowchartElementTypes.Flowchart_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FlowchartElementTypes.Event_2001 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		if (FlowchartElementTypes.Assignment_2002 == req.getElementType()) {
			return getGEFWrapper(new AssignmentCreateCommand(req));
		}
		if (FlowchartElementTypes.Decision_2003 == req.getElementType()) {
			return getGEFWrapper(new DecisionCreateCommand(req));
		}
		if (FlowchartElementTypes.Input_2004 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (FlowchartElementTypes.Output_2005 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
