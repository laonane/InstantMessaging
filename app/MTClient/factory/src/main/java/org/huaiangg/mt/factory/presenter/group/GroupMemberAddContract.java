package org.huaiangg.mt.factory.presenter.group;

import org.huaiangg.mt.factory.presenter.BaseContract;

/**
 * @description: 群成员添加的契约
 * @author: HuaiAngg
 * @create: 2019-04-09 16:11
 */
public interface GroupMemberAddContract {
    interface Presenter extends BaseContract.Presenter {
        // 提交成员
        void submit();

        // 更改一个Model的选中状态
        void changeSelect(GroupCreateContract.ViewModel model, boolean isSelected);
    }

    // 界面
    interface View extends BaseContract.RecyclerView<Presenter, GroupCreateContract.ViewModel> {
        // 添加群成员成功
        void onAddedSucceed();

        // 获取群的Id
        String getGroupId();
    }
}
