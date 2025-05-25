package ae;

import ac.s;
import android.content.Context;
import be.d;
import bf.i;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import uc.h;
import vc.a0;
import wh.o;

/* compiled from: MoEFireBaseHelper.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0022a f2111b = new C0022a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static a f2112c;

    /* renamed from: a  reason: collision with root package name */
    public final String f2113a;

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
        this.f2113a = "FCM_6.6.0_MoEFireBaseHelper";
    }

    /* compiled from: MoEFireBaseHelper.kt */
    public static final class c extends Lambda implements gi.a<String> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a f2115m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(0);
            this.f2115m = aVar;
        }

        public final String invoke() {
            return this.f2115m.f2113a + " passPushToken() : Instance not initialised, cannot process further";
        }
    }

    public final void e(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        a0 instance = s.f2098a.e();
        if (instance == null) {
            h.a.d(h.f19273e, 0, (Throwable) null, new c(this), 3);
        } else {
            f(context, instance, token);
        }
    }

    public final void d(Context context, Map<String, String> payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        try {
            i.f4973b.a().l(context, payload);
        } catch (Exception e10) {
            h.f19273e.b(1, e10, new b(this));
        }
    }

    /* compiled from: MoEFireBaseHelper.kt */
    public static final class b extends Lambda implements gi.a<String> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a f2114m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f2114m = aVar;
        }

        public final String invoke() {
            return this.f2114m.f2113a + " passPushPayload() : ";
        }
    }

    /* renamed from: ae.a$a  reason: collision with other inner class name */
    /* compiled from: MoEFireBaseHelper.kt */
    public static final class C0022a {
        public /* synthetic */ C0022a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0022a() {
        }

        public final a a() {
            if (a.f2112c == null) {
                synchronized (a.class) {
                    if (a.f2112c == null) {
                        C0022a aVar = a.f2111b;
                        a.f2112c = new a((DefaultConstructorMarker) null);
                    }
                    o oVar = o.f20355a;
                }
            }
            a a10 = a.f2112c;
            Intrinsics.checkNotNull(a10, "null cannot be cast to non-null type com.moengage.firebase.MoEFireBaseHelper");
            return a10;
        }
    }

    public final void f(Context context, a0 sdkInstance, String token) {
        d.f4915a.a(sdkInstance).c(context, token, "App");
    }
}
