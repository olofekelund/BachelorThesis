/**
 */
package org.language.reqLanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.language.reqLanguage.PrefixCondition;
import org.language.reqLanguage.ReqLanguageFactory;
import org.language.reqLanguage.ReqLanguagePackage;

/**
 * This is the item provider adapter for a {@link org.language.reqLanguage.PrefixCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrefixConditionItemProvider 
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
	public PrefixConditionItemProvider(AdapterFactory adapterFactory) {
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

			addPrefixFixedSyntaxPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix Fixed Syntax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixFixedSyntaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrefixCondition_prefixFixedSyntax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrefixCondition_prefixFixedSyntax_feature", "_UI_PrefixCondition_type"),
				 ReqLanguagePackage.Literals.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER);
			childrenFeatures.add(ReqLanguagePackage.Literals.PREFIX_CONDITION__OPERATOR);
			childrenFeatures.add(ReqLanguagePackage.Literals.PREFIX_CONDITION__VALUE);
			childrenFeatures.add(ReqLanguagePackage.Literals.PREFIX_CONDITION__TIME);
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
	 * This returns PrefixCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrefixCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PrefixCondition)object).getPrefixFixedSyntax();
		return label == null || label.length() == 0 ?
			getString("_UI_PrefixCondition_type") :
			getString("_UI_PrefixCondition_type") + " " + label;
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

		switch (notification.getFeatureID(PrefixCondition.class)) {
			case ReqLanguagePackage.PREFIX_CONDITION__PREFIX_FIXED_SYNTAX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ReqLanguagePackage.PREFIX_CONDITION__PARAMETER:
			case ReqLanguagePackage.PREFIX_CONDITION__OPERATOR:
			case ReqLanguagePackage.PREFIX_CONDITION__VALUE:
			case ReqLanguagePackage.PREFIX_CONDITION__TIME:
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
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createReqID()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createPrefixRightOperand()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createPrefixState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createPrefixCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createPrefixEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createParamEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createActorEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createParameterState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createMainFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createMainComposition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createMainStateTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createMainAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createOutTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createNoTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER,
				 ReqLanguageFactory.eINSTANCE.createTimingConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__OPERATOR,
				 ReqLanguageFactory.eINSTANCE.createOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__VALUE,
				 ReqLanguageFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqLanguagePackage.Literals.PREFIX_CONDITION__TIME,
				 ReqLanguageFactory.eINSTANCE.createTimingConstraint()));
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
			childFeature == ReqLanguagePackage.Literals.PREFIX_CONDITION__PARAMETER ||
			childFeature == ReqLanguagePackage.Literals.PREFIX_CONDITION__OPERATOR ||
			childFeature == ReqLanguagePackage.Literals.PREFIX_CONDITION__VALUE ||
			childFeature == ReqLanguagePackage.Literals.PREFIX_CONDITION__TIME;

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
