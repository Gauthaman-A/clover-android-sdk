/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v1.inventory;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.clover.sdk.v1.BindingException;
import com.clover.sdk.v1.ClientException;
import com.clover.sdk.v1.ResultStatus;
import com.clover.sdk.v1.ServiceConnector;
import com.clover.sdk.v1.ServiceException;

import java.util.List;

public class InventoryConnector extends ServiceConnector<IInventoryService> {
  public InventoryConnector(Context context, Account account, OnServiceConnectedListener client) {
    super(context, account, client);
  }

  protected String getServiceIntentAction() {
    return InventoryIntent.ACTION_INVENTORY_SERVICE;
  }


  protected IInventoryService getServiceInterface(IBinder iBinder) {
    return IInventoryService.Stub.asInterface(iBinder);
  }

  public List<Item> getItems() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Item>>() {
      public List<Item> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItems(status);
      }
    });
  }

  public void getItems(Callback<List<Item>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Item>>() {
      public List<Item> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItems(status);
      }
    }, callback);
  }

  public List<Item> getItemsWithCategories() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Item>>() {
      public List<Item> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemsWithCategories(status);
      }
    });
  }

  public void getItemsWithCategories(Callback<List<Item>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Item>>() {
      public List<Item> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemsWithCategories(status);
      }
    }, callback);
  }

  public List<String> getItemIds() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<String>>() {
      public List<String> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemIds(status);
      }
    });
  }

  public void getItemIds(Callback<List<String>> callback) {
    execute(new ServiceCallable<IInventoryService, List<String>>() {
      public List<String> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemIds(status);
      }
    }, callback);
  }

  public Item getItem(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItem(itemId, status);
      }
    });
  }

  public void getItem(final String itemId, Callback<Item> callback) {
    execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItem(itemId, status);
      }
    }, callback);
  }

  public Item getItemWithCategories(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemWithCategories(itemId, status);
      }
    });
  }

  public void getItemWithCategories(final String itemId, Callback<Item> callback) {
    execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getItemWithCategories(itemId, status);
      }
    }, callback);
  }

  public Item createItem(final Item item) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createItem(item, status);
      }
    });
  }

  public void createItem(final Item item, Callback<Item> callback) {
    execute(new ServiceCallable<IInventoryService, Item>() {
      public Item call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createItem(item, status);
      }
    }, callback);
  }

  public void updateItem(final Item item) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateItem(item, status);
      }
    });
  }

  public void updateItem(final Item item, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateItem(item, status);
        return null;
      }
    }, callback);
  }

  public void deleteItem(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteItem(itemId, status);
      }
    });
  }

  public void deleteItem(final String itemId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteItem(itemId, status);
        return null;
      }
    }, callback);
  }

  public List<CategoryDescription> getCategories() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<CategoryDescription>>() {
      public List<CategoryDescription> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getCategories(status);
      }
    });
  }

  public void getCategories(Callback<List<CategoryDescription>> callback) {
    execute(new ServiceCallable<IInventoryService, List<CategoryDescription>>() {
      public List<CategoryDescription> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getCategories(status);
      }
    }, callback);
  }

  public CategoryDescription createCategory(final CategoryDescription category) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, CategoryDescription>() {
      public CategoryDescription call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createCategory(category, status);
      }
    });
  }

  public void createCategory(final CategoryDescription category, Callback<CategoryDescription> callback) {
    execute(new ServiceCallable<IInventoryService, CategoryDescription>() {
      public CategoryDescription call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createCategory(category, status);
      }
    }, callback);
  }

  public void updateCategory(final CategoryDescription category) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateCategory(category, status);
      }
    });
  }

  public void updateCategory(final CategoryDescription category, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateCategory(category, status);
        return null;
      }
    }, callback);
  }

  public void deleteCategory(final String categoryId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteCategory(categoryId, status);
      }
    });
  }

  public void deleteCategory(final String categoryId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteCategory(categoryId, status);
        return null;
      }
    }, callback);
  }

  public void addItemToCategory(final String itemId, final String categoryId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.addItemToCategory(itemId, categoryId, status);
      }
    });
  }

  public void addItemToCategory(final String itemId, final String categoryId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.addItemToCategory(itemId, categoryId, status);
        return null;
      }
    }, callback);
  }

  public void removeItemFromCategory(final String itemId, final String categoryId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeItemFromCategory(itemId, categoryId, status);
      }
    });
  }

  public void removeItemFromCategory(final String itemId, final String categoryId, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeItemFromCategory(itemId, categoryId, status);
      }
    }, callback);
  }

  public void moveItemInCategoryLayout(final String itemId, final String categoryId, final int direction) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.moveItemInCategoryLayout(itemId, categoryId, direction, status);
      }
    });
  }

  public void moveItemInCategoryLayout(final String itemId, final String categoryId, final int direction, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.moveItemInCategoryLayout(itemId, categoryId, direction, status);
      }
    }, callback);
  }

  public List<ModifierGroup> getModifierGroups() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<ModifierGroup>>() {
      public List<ModifierGroup> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifierGroups(status);
      }
    });
  }

  public void getModifierGroups(Callback<List<ModifierGroup>> callback) {
    execute(new ServiceCallable<IInventoryService, List<ModifierGroup>>() {
      public List<ModifierGroup> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifierGroups(status);
      }
    }, callback);
  }

  public ModifierGroup createModifierGroup(final ModifierGroup group) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, ModifierGroup>() {
      public ModifierGroup call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createModifierGroup(group, status);
      }
    });
  }

  public void createModifierGroup(final ModifierGroup modifierGroup, Callback<ModifierGroup> callback) {
    execute(new ServiceCallable<IInventoryService, ModifierGroup>() {
      public ModifierGroup call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createModifierGroup(modifierGroup, status);
      }
    }, callback);
  }

  public void updateModifierGroup(final ModifierGroup group) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateModifierGroup(group, status);
      }
    });
  }

  public void updateModifierGroup(final ModifierGroup modifierGroup, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateModifierGroup(modifierGroup, status);
      }
    }, callback);
  }

  public void deleteModifierGroup(final String groupId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteModifierGroup(groupId, status);
      }
    });
  }

  public void deleteModifierGroup(final String groupId, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteModifierGroup(groupId, status);
      }
    }, callback);
  }

  public List<Modifier> getModifiers(final String modifierGroupId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Modifier>>() {
      public List<Modifier> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifiers(modifierGroupId, status);
      }
    });
  }

  public void getModifiers(final String modifierGroupId, Callback<List<Modifier>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Modifier>>() {
      public List<Modifier> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifiers(modifierGroupId, status);
      }
    }, callback);
  }

  public Modifier createModifier(final String modifierGroupId, final Modifier modifier) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Modifier>() {
      public Modifier call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createModifier(modifierGroupId, modifier, status);
      }
    });
  }

  public void createModifier(final String modifierGroupId, final Modifier modifier, Callback<Modifier> callback) {
    execute(new ServiceCallable<IInventoryService, Modifier>() {
      public Modifier call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createModifier(modifierGroupId, modifier, status);
      }
    }, callback);
  }

  public void updateModifier(final Modifier modifier) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateModifier(modifier, status);
      }
    });
  }

  public void updateModifier(final Modifier modifier, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateModifier(modifier, status);
      }
    }, callback);
  }

  public void deleteModifier(final String modifierId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteModifier(modifierId, status);
      }
    });
  }

  public void deleteModifier(final String modifierId, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteModifier(modifierId, status);
      }
    }, callback);
  }

  public List<TaxRate> getTaxRatesForItem(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<TaxRate>>() {
      public List<TaxRate> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRatesForItem(itemId, status);
      }
    });
  }

  public void getTaxRatesForItem(final String itemId, Callback<List<TaxRate>> callback) {
    execute(new ServiceCallable<IInventoryService, List<TaxRate>>() {
      public List<TaxRate> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRatesForItem(itemId, status);
      }
    }, callback);
  }

  public void assignTaxRatesToItem(final String itemId, final List<String> taxRates) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.assignTaxRatesToItem(itemId, taxRates, status);
      }
    });
  }

  public void removeTaxRatesFromItem(final String itemId, final List<String> taxRates) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeTaxRatesFromItem(itemId, taxRates, status);
      }
    });
  }

  public List<TaxRate> getTaxRates() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<TaxRate>>() {
      public List<TaxRate> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRates(status);
      }
    });
  }

  public void getTaxRates(Callback<List<TaxRate>> callback) {
    execute(new ServiceCallable<IInventoryService, List<TaxRate>>() {
      public List<TaxRate> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRates(status);
      }
    }, callback);
  }

  public TaxRate getTaxRate(final String taxRateId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, TaxRate>() {
      public TaxRate call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRate(taxRateId, status);
      }
    });
  }

  public void getTaxRate(final String taxRateId, Callback<TaxRate> callback) {
    execute(new ServiceCallable<IInventoryService, TaxRate>() {
      public TaxRate call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTaxRate(taxRateId, status);
      }
    }, callback);
  }

  public void assignModifierGroupToItem(final String modifierGroupId, final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.assignModifierGroupToItem(modifierGroupId, itemId, status);
        return null;
      }
    });
  }

  public void assignModifierGroupToItem(final String modifierGroupId, final String itemId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.assignModifierGroupToItem(modifierGroupId, itemId, status);
        return null;
      }
    }, callback);
  }

  public void removeModifierGroupFromItem(final String modifierGroupId, final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeModifierGroupFromItem(modifierGroupId, itemId, status);
        return null;
      }
    });
  }

  public void removeModifierGroupFromItem(final String modifierGroupId, final String itemId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeModifierGroupFromItem(modifierGroupId, itemId, status);
        return null;
      }
    }, callback);
  }

  public List<ModifierGroup> getModifierGroupsForItem(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<ModifierGroup>>() {
      public List<ModifierGroup> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifierGroupsForItem(itemId, status);
      }
    });
  }

  public void getModifierGroupsForItem(final String itemId, Callback<List<ModifierGroup>> callback) {
    execute(new ServiceCallable<IInventoryService, List<ModifierGroup>>() {
      public List<ModifierGroup> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getModifierGroupsForItem(itemId, status);
      }
    }, callback);
  }

  public List<Discount> getDiscounts() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Discount>>() {
      public List<Discount> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getDiscounts(status);
      }
    });
  }

  public void getDiscounts(Callback<List<Discount>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Discount>>() {
      public List<Discount> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getDiscounts(status);
      }
    }, callback);
  }

  public Discount getDiscount(final String discountId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Discount>() {
      public Discount call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getDiscount(discountId, status);
      }
    });
  }

  public void getDiscount(final String discountId, Callback<Discount> callback) {
    execute(new ServiceCallable<IInventoryService, Discount>() {
      public Discount call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getDiscount(discountId, status);
      }
    }, callback);
  }

  public Discount createDiscount(final Discount discount) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Discount>() {
      public Discount call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createDiscount(discount, status);
      }
    });
  }

  public void createDiscount(final Discount discount, Callback<Discount> callback) {
    execute(new ServiceCallable<IInventoryService, Discount>() {
      public Discount call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createDiscount(discount, status);
      }
    }, callback);
  }

  public void updateDiscount(final Discount discount) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateDiscount(discount, status);
      }
    });
  }

  public void updateDiscount(final Discount discount, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateDiscount(discount, status);
        return null;
      }
    }, callback);
  }

  public void deleteDiscount(final String discountId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteDiscount(discountId, status);
      }
    });
  }

  public void deleteDiscount(final String discountId, Callback<Void> callback) {
    execute(new ServiceCallable<IInventoryService, Void>() {
      public Void call(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteDiscount(discountId, status);
        return null;
      }
    }, callback);
  }

  public List<Tag> getTags() throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Tag>>() {
      public List<Tag> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTags(status);
      }
    });
  }

  public void getTags(Callback<List<Tag>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Tag>>() {
      public List<Tag> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTags(status);
      }
    }, callback);
  }

  public Tag getTag(final String tagId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Tag>() {
      public Tag call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTag(tagId, status);
      }
    });
  }

  public void getTag(final String tagId, Callback<Tag> callback) {
    execute(new ServiceCallable<IInventoryService, Tag>() {
      public Tag call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTag(tagId, status);
      }
    }, callback);
  }

  public Tag createTag(final Tag tag) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, Tag>() {
      public Tag call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createTag(tag, status);
      }
    });
  }

  public void createTag(final Tag tag, Callback<Tag> callback) {
    execute(new ServiceCallable<IInventoryService, Tag>() {
      public Tag call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.createTag(tag, status);
      }
    }, callback);
  }

  public void updateTag(final Tag tag) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateTag(tag, status);
      }
    });
  }

  public void updateTag(final Tag tag, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.updateTag(tag, status);
      }
    }, callback);
  }

  public void deleteTag(final String tagId) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteTag(tagId, status);
      }
    });
  }

  public void deleteTag(final String tagId, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.deleteTag(tagId, status);
      }
    }, callback);
  }

  public List<Tag> getTagsForItem(final String itemId) throws ClientException, ServiceException, BindingException, RemoteException {
    return execute(new ServiceCallable<IInventoryService, List<Tag>>() {
      public List<Tag> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTagsForItem(itemId, status);
      }
    });
  }

  public void getTagsForItem(final String itemId, Callback<List<Tag>> callback) {
    execute(new ServiceCallable<IInventoryService, List<Tag>>() {
      public List<Tag> call(IInventoryService service, ResultStatus status) throws RemoteException {
        return service.getTagsForItem(itemId, status);
      }
    }, callback);
  }

  public void assignTagsToItem(final String itemId, final List<String> tags) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.assignTagsToItem(itemId, tags, status);
      }
    });
  }

  public void assignTagsToItem(final String itemId, final List<String> tags, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.assignTagsToItem(itemId, tags, status);
      }
    }, callback);
  }

  public void removeTagsFromItem(final String itemId, final List<String> tags) throws ClientException, ServiceException, BindingException, RemoteException {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeTagsFromItem(itemId, tags, status);
      }
    });
  }

  public void removeTagsFromItem(final String itemId, final List<String> tags, Callback<Void> callback) {
    execute(new ServiceRunnable<IInventoryService>() {
      public void run(IInventoryService service, ResultStatus status) throws RemoteException {
        service.removeTagsFromItem(itemId, tags, status);
      }
    }, callback);
  }
  
}
