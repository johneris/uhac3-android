package ph.coreproc.android.uhac3.domain.modules;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import ph.coreproc.android.uhac3.domain.interactors.user.GetLoggedInUserInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.GetLoggedInUserInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.user.GetUserInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.GetUserInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.user.LoginInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.LoginInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.user.LogoutInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.LogoutInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.user.RegisterInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.RegisterInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.user.UpdateUserInteractor;
import ph.coreproc.android.uhac3.domain.interactors.user.UpdateUserInteractorImpl;
import ph.coreproc.android.uhac3.domain.interactors.util.VerifyMobileNumberInteractor;
import ph.coreproc.android.uhac3.domain.interactors.util.VerifyMobileNumberInteractorImpl;
import rx.Scheduler;

/**
 * Created by johneris on 23/09/2016.
 */
@Module
public class InteractorModule {

    private Scheduler mExecutionThread;
    private Scheduler mPostExecutionThread;

    public InteractorModule(Scheduler executionThread, Scheduler postExecutionThread) {
        mExecutionThread = executionThread;
        mPostExecutionThread = postExecutionThread;
    }

    @Provides
    @Named("execution")
    Scheduler executionThread() {
        return mExecutionThread;
    }

    @Provides
    @Named("post_execution")
    Scheduler postExecutionThread() {
        return mPostExecutionThread;
    }


    // MARK: - User

    @Provides
    LoginInteractor provideLoginInteractor(LoginInteractorImpl loginInteractor) {
        return loginInteractor;
    }

    @Provides
    GetLoggedInUserInteractor provideGetLoggedInUserInteractor(GetLoggedInUserInteractorImpl getLoggedInUserInteractor) {
        return getLoggedInUserInteractor;
    }

    @Provides
    LogoutInteractor provideLogoutInteractor(LogoutInteractorImpl logoutInteractor) {
        return logoutInteractor;
    }

    @Provides
    GetUserInteractor provideGetUserInteractor(GetUserInteractorImpl getUserInteractor) {
        return getUserInteractor;
    }

    @Provides
    UpdateUserInteractor provideUpdateUserInteractor(UpdateUserInteractorImpl updateUserInteractor) {
        return updateUserInteractor;
    }

    @Provides
    RegisterInteractor provideRegisterInteractor(RegisterInteractorImpl registerInteractor) {
        return registerInteractor;
    }

    // MARK: - End User

    // MARK: - Util

    @Provides
    VerifyMobileNumberInteractor provideVerifyMobileNumberInteractor(VerifyMobileNumberInteractorImpl verifyMobileNumberInteractor) {
        return verifyMobileNumberInteractor;
    }

    // MARK: - End Util

}
