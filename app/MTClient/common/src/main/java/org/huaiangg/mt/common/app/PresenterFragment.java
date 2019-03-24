package org.huaiangg.mt.common.app;

import android.content.Context;

import org.huaiangg.mt.factory.presenter.BaseContract;

/**
 * @description:
 * @author: HuaiAngg
 * @create: 2019-03-24 14:52
 */
public abstract class PresenterFragment<Presenter extends BaseContract.Presenter> extends Fragment
        implements BaseContract.View<Presenter> {
    protected Presenter mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // 在界面onAttach之后就触发初始化Presenter
        initPresenter();
    }

    /**
     * 初始化Presenter
     * @return Presenter
     */
    protected abstract Presenter initPresenter();

    @Override
    public void showError(int str) {
        // 显示错误
        Application.showToast(str);
    }

    @Override
    public void showLoading() {
        // TODO 显示一个Loading
    }

    @Override
    public void setPresenter(Presenter presenter) {
        // View中赋值Presenter
        mPresenter = presenter;
    }
}
