/**
 */
package org.language.reqLanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.language.reqLanguage.MainStateTransition;
import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * This is the item provider adapter for a {@link org.language.reqLanguage.MainStateTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MainStateTransitionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainStateTransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__SYSTEM);
			childrenFeatures.add(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION);
			childrenFeatures.add(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__FUNCTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MainStateTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MainStateTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MainStateTransition_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MainStateTransition.class)) {
			case ReqLanguagePackage.MAIN_STATE_TRANSITION__SYSTEM:
			case ReqLanguagePackage.MAIN_STATE_TRANSITION__TRANSITION:
			case ReqLanguagePackage.MAIN_STATE_TRANSITION__FUNCTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__SYSTEM,
				 ReqLanguageFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createReqID()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createPrefixRightOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createPrefixState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createPrefixCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createPrefixEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createParamEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createActorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createParameterState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createMainFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createMainComposition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createMainStateTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createMainAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createOutTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createNoTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION,
				 ReqLanguageFactory.eINSTANCE.createTimingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__FUNCTION,
				 ReqLanguageFactory.eINSTANCE.createAction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__SYSTEM ||
			childFeature == ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__TRANSITION ||
			childFeature == ReqLanguagePackage.Literals.MAIN_STATE_TRANSITION__FUNCTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReqLanguageEditPlugin.INSTANCE;
	}

}
