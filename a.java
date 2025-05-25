package qg;

import ai.k;
import android.content.Context;
import android.location.Geocoder;
import androidx.databinding.j;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.z;
import com.google.android.gms.maps.model.LatLng;
import com.karumi.dexter.BuildConfig;
import gi.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import mg.c;
import ni.c0;
import ni.d1;
import ni.e0;
import ni.o0;
import org.json.JSONArray;
import org.json.JSONObject;
import wh.f;
import wh.g;
import wh.o;

/* compiled from: DirectionViewModel.kt */
public final class a extends m0 {

    /* renamed from: d  reason: collision with root package name */
    public double f17064d;

    /* renamed from: e  reason: collision with root package name */
    public long f17065e;

    /* renamed from: f  reason: collision with root package name */
    public j<String> f17066f = new j<>();

    /* renamed from: g  reason: collision with root package name */
    public j<String> f17067g = new j<>();

    /* renamed from: h  reason: collision with root package name */
    public double f17068h;

    /* renamed from: i  reason: collision with root package name */
    public j<String> f17069i = new j<>();

    /* renamed from: j  reason: collision with root package name */
    public j<String> f17070j = new j<>();

    /* renamed from: k  reason: collision with root package name */
    public j<String> f17071k = new j<>();

    /* renamed from: l  reason: collision with root package name */
    public j<String> f17072l = new j<>();

    /* renamed from: m  reason: collision with root package name */
    public j<String> f17073m = new j<>();

    /* renamed from: n  reason: collision with root package name */
    public final f f17074n = g.a(C0314a.f17076m);

    /* renamed from: o  reason: collision with root package name */
    public z<mg.c<ArrayList<LatLng>>> f17075o = new z<>();

    @ai.f(c = "com.taxinadriver.viewmodel.googleapis.DirectionViewModel", f = "DirectionViewModel.kt", l = {307}, m = "fetchLocality")
    /* compiled from: DirectionViewModel.kt */
    public static final class b extends ai.d {

        /* renamed from: m  reason: collision with root package name */
        public Object f17077m;

        /* renamed from: n  reason: collision with root package name */
        public int f17078n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f17079o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ a f17080p;

        /* renamed from: q  reason: collision with root package name */
        public int f17081q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, yh.d<? super b> dVar) {
            super(dVar);
            this.f17080p = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17079o = obj;
            this.f17081q |= IntCompanionObject.MIN_VALUE;
            return this.f17080p.l((Context) null, 0.0d, 0.0d, 0, this);
        }
    }

    public final j<String> t() {
        return this.f17066f;
    }

    public final j<String> q() {
        return this.f17067g;
    }

    public final double s() {
        return this.f17068h;
    }

    public final j<String> v() {
        return this.f17069i;
    }

    public final j<String> r() {
        return this.f17070j;
    }

    public final j<String> p() {
        return this.f17071k;
    }

    /* renamed from: qg.a$a  reason: collision with other inner class name */
    /* compiled from: DirectionViewModel.kt */
    public static final class C0314a extends Lambda implements gi.a<z<JSONObject>> {

        /* renamed from: m  reason: collision with root package name */
        public static final C0314a f17076m = new C0314a();

        public C0314a() {
            super(0);
        }

        /* renamed from: a */
        public final z<JSONObject> invoke() {
            return new z<>();
        }
    }

    public final z<JSONObject> o() {
        return (z) this.f17074n.getValue();
    }

    public final LiveData<mg.c<ArrayList<LatLng>>> u() {
        return this.f17075o;
    }

    public final void m(String google_key, LatLng pickup_address, LatLng drop_address) {
        Intrinsics.checkNotNullParameter(google_key, "google_key");
        Intrinsics.checkNotNullParameter(pickup_address, "pickup_address");
        Intrinsics.checkNotNullParameter(drop_address, "drop_address");
        Ref.ObjectRef request_url = new Ref.ObjectRef();
        request_url.element = "https://maps.googleapis.com/maps/api/directions/json?";
        request_url.element = ((String) request_url.element) + "origin=" + pickup_address.f6114m + ',' + pickup_address.f6115n;
        request_url.element = ((String) request_url.element) + "&destination=" + drop_address.f6114m + ',' + drop_address.f6115n;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) request_url.element);
        sb2.append("&optimize:true");
        request_url.element = sb2.toString();
        request_url.element = ((String) request_url.element) + "&mode=driving&key=" + google_key;
        d1 unused = ni.f.b(n0.a(this), o0.b(), (e0) null, new d(request_url, this, (yh.d<? super d>) null), 2);
    }

    @ai.f(c = "com.taxinadriver.viewmodel.googleapis.DirectionViewModel$getDirectionDriverApi$1", f = "DirectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: DirectionViewModel.kt */
    public static final class d extends k implements p<c0, yh.d<? super o>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f17085m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ a f17086n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Ref.ObjectRef<String> objectRef, a aVar, yh.d<? super d> dVar) {
            super(2, dVar);
            this.f17085m = objectRef;
            this.f17086n = aVar;
        }

        public final yh.d<o> create(Object obj, yh.d<?> dVar) {
            return new d(this.f17085m, this.f17086n, dVar);
        }

        public final Object invoke(c0 c0Var, yh.d<? super o> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(o.f20355a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
            if (r3 == null) goto L_0x0088;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
            if (r3 == null) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.String r0 = "status"
                zh.c.c()
                r1 = 0
                switch(r1) {
                    case 0: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0011:
                wh.j.b(r12)
                r2 = r11
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r6 = r2.f17085m     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                T r6 = r6.element     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                java.net.URLConnection r6 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                if (r6 == 0) goto L_0x0051
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                r3 = r6
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                r6 = 0
                r7 = 1024(0x400, float:1.435E-42)
                char[] r7 = new char[r7]     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
            L_0x003e:
                int r8 = r5.read(r7)     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                r9 = r8
                r10 = 0
                r6 = r9
                r9 = -1
                if (r8 == r9) goto L_0x004c
                r4.append(r7, r1, r6)     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                goto L_0x003e
            L_0x004c:
            L_0x004d:
                r3.disconnect()
                goto L_0x0086
            L_0x0051:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                java.lang.String r6 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
                throw r5     // Catch:{ MalformedURLException -> 0x0071, IOException -> 0x005c }
            L_0x0059:
                r0 = move-exception
                goto L_0x011a
            L_0x005c:
                r5 = move-exception
                qg.a r5 = r2.f17086n     // Catch:{ all -> 0x0059 }
                androidx.lifecycle.z r5 = r5.f17075o     // Catch:{ all -> 0x0059 }
                mg.c$b r6 = new mg.c$b     // Catch:{ all -> 0x0059 }
                java.lang.String r7 = "IOException"
                r6.<init>(r7)     // Catch:{ all -> 0x0059 }
                r5.l(r6)     // Catch:{ all -> 0x0059 }
                if (r3 == 0) goto L_0x0086
            L_0x0070:
                goto L_0x004d
            L_0x0071:
                r5 = move-exception
                qg.a r5 = r2.f17086n     // Catch:{ all -> 0x0059 }
                androidx.lifecycle.z r5 = r5.f17075o     // Catch:{ all -> 0x0059 }
                mg.c$b r6 = new mg.c$b     // Catch:{ all -> 0x0059 }
                java.lang.String r7 = "MalformedURLException"
                r6.<init>(r7)     // Catch:{ all -> 0x0059 }
                r5.l(r6)     // Catch:{ all -> 0x0059 }
                if (r3 == 0) goto L_0x0086
                goto L_0x0070
            L_0x0086:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r5 = r4.toString()     // Catch:{ JSONException -> 0x0106 }
                r3.<init>(r5)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r4 = r3.optString(r0)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r5 = "OK"
                r6 = 1
                boolean r4 = mi.n.l(r4, r5, r6)     // Catch:{ JSONException -> 0x0106 }
                if (r4 != 0) goto L_0x00cb
                qg.a r1 = r2.f17086n     // Catch:{ JSONException -> 0x0106 }
                androidx.lifecycle.z r1 = r1.f17075o     // Catch:{ JSONException -> 0x0106 }
                mg.c$b r4 = new mg.c$b     // Catch:{ JSONException -> 0x0106 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0106 }
                r5.<init>()     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r0 = r3.optString(r0)     // Catch:{ JSONException -> 0x0106 }
                r5.append(r0)     // Catch:{ JSONException -> 0x0106 }
                r0 = 32
                r5.append(r0)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r3.optString(r0)     // Catch:{ JSONException -> 0x0106 }
                r5.append(r0)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x0106 }
                r4.<init>(r0)     // Catch:{ JSONException -> 0x0106 }
                r1.l(r4)     // Catch:{ JSONException -> 0x0106 }
                goto L_0x0117
            L_0x00cb:
                java.lang.String r0 = "routes"
                org.json.JSONArray r0 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x0106 }
                org.json.JSONObject r1 = r0.getJSONObject(r1)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r3 = "overview_polyline"
                org.json.JSONObject r3 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r4 = "waypoint_order"
                org.json.JSONArray r4 = r1.getJSONArray(r4)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r5 = r4.toString()     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r6 = "j_array_way.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch:{ JSONException -> 0x0106 }
                qg.a r6 = r2.f17086n     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r7 = "legs"
                org.json.JSONArray r7 = r1.getJSONArray(r7)     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r8 = "j_obj_array.getJSONArray(\"legs\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch:{ JSONException -> 0x0106 }
                r6.w(r7)     // Catch:{ JSONException -> 0x0106 }
                qg.a r6 = r2.f17086n     // Catch:{ JSONException -> 0x0106 }
                java.lang.String r7 = "points"
                java.lang.String r7 = r3.optString(r7)     // Catch:{ JSONException -> 0x0106 }
                r6.k(r7)     // Catch:{ JSONException -> 0x0106 }
                goto L_0x0117
            L_0x0106:
                r0 = move-exception
                qg.a r0 = r2.f17086n
                androidx.lifecycle.z r0 = r0.f17075o
                mg.c$b r1 = new mg.c$b
                java.lang.String r3 = "JsonException"
                r1.<init>(r3)
                r0.l(r1)
            L_0x0117:
                wh.o r0 = wh.o.f20355a
                return r0
            L_0x011a:
                if (r3 == 0) goto L_0x0120
                r3.disconnect()
            L_0x0120:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void w(JSONArray legs) {
        try {
            this.f17070j.h(BuildConfig.FLAVOR);
            this.f17071k.h(BuildConfig.FLAVOR);
            this.f17064d = 0.0d;
            this.f17065e = 0;
            int length = legs.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonObject = legs.getJSONObject(i10);
                JSONObject dis = jsonObject.getJSONObject("distance");
                JSONObject dura = jsonObject.getJSONObject("duration");
                double d10 = this.f17064d;
                String optString = dis.optString("value");
                Intrinsics.checkNotNullExpressionValue(optString, "dis.optString(\"value\")");
                this.f17064d = d10 + Double.parseDouble(optString);
                long j10 = this.f17065e;
                String optString2 = dura.optString("value");
                Intrinsics.checkNotNullExpressionValue(optString2, "dura.optString(\"value\")");
                this.f17065e = j10 + Long.parseLong(optString2);
                if (i10 == 0) {
                    if (legs.length() > 1) {
                        this.f17073m.h(dis.optString("text"));
                        this.f17072l.h(dura.optString("text"));
                    }
                }
                if (i10 == legs.length() - 1) {
                    this.f17070j.h(dura.optString("text"));
                    j(dura.optLong("value"));
                    this.f17071k.h(dis.optString("text"));
                    this.f17068h = ((double) dis.optInt("value")) / 1000.0d;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void k(String encoded) {
        int i10;
        int dlng;
        int result;
        String str = encoded;
        ArrayList poly = new ArrayList();
        if (str != null) {
            boolean z10 = false;
            if (!(encoded.length() == 0)) {
                CharSequence $this$trim$iv$iv = encoded;
                int startIndex$iv$iv = 0;
                int endIndex$iv$iv = $this$trim$iv$iv.length() - 1;
                boolean startFound$iv$iv = false;
                while (true) {
                    i10 = 32;
                    if (startIndex$iv$iv > endIndex$iv$iv) {
                        break;
                    }
                    char it = Intrinsics.compare((int) $this$trim$iv$iv.charAt(!startFound$iv$iv ? startIndex$iv$iv : endIndex$iv$iv), 32) <= 0 ? (char) 1 : 0;
                    if (!startFound$iv$iv) {
                        if (it == 0) {
                            startFound$iv$iv = true;
                        } else {
                            startIndex$iv$iv++;
                        }
                    } else if (it == 0) {
                        break;
                    } else {
                        endIndex$iv$iv--;
                    }
                }
                if ($this$trim$iv$iv.subSequence(startIndex$iv$iv, endIndex$iv$iv + 1).toString().length() > 0) {
                    z10 = true;
                }
                if (z10) {
                    int dlat = 0;
                    int len = encoded.length();
                    int shift = 0;
                    int lng = 0;
                    while (dlat < len) {
                        int shift2 = 0;
                        int result2 = 0;
                        while (true) {
                            dlng = dlat + 1;
                            int b10 = str.charAt(dlat) - 63;
                            result2 |= (b10 & 31) << shift2;
                            shift2 += 5;
                            if (b10 < i10) {
                                break;
                            }
                            dlat = dlng;
                            i10 = 32;
                        }
                        int lat = shift + ((result2 & 1) != 0 ? ~(result2 >> 1) : result2 >> 1);
                        int shift3 = 0;
                        int result3 = 0;
                        while (true) {
                            result = dlng + 1;
                            int b11 = str.charAt(dlng) - 63;
                            result3 |= (b11 & 31) << shift3;
                            shift3 += 5;
                            if (b11 < i10) {
                                break;
                            }
                            dlng = result;
                            i10 = 32;
                        }
                        lng += (result3 & 1) != 0 ? ~(result3 >> 1) : result3 >> 1;
                        poly.add(new LatLng(((double) lat) / 100000.0d, ((double) lng) / 100000.0d));
                        dlat = result;
                        shift = lat;
                        i10 = 32;
                    }
                }
            }
        }
        this.f17075o.l(new c.d(poly));
    }

    public final void j(long durationInSec) {
        long j10 = (long) 60;
        long totalMinute = durationInSec / j10;
        int minutes = (int) (totalMinute % j10);
        Calendar calendar = Calendar.getInstance();
        calendar.add(11, (int) (totalMinute / j10));
        calendar.add(12, minutes);
        this.f17069i.h(new SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(calendar.getTime()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(android.content.Context r17, double r18, double r20, int r22, yh.d<? super wh.o> r23) {
        /*
            r16 = this;
            r0 = r23
            boolean r1 = r0 instanceof qg.a.b
            if (r1 == 0) goto L_0x0018
            r1 = r0
            qg.a$b r1 = (qg.a.b) r1
            int r2 = r1.f17081q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f17081q = r2
            r0 = r1
            r2 = r16
            goto L_0x0020
        L_0x0018:
            qg.a$b r1 = new qg.a$b
            r2 = r16
            r1.<init>(r2, r0)
            r0 = r1
        L_0x0020:
            java.lang.Object r1 = r0.f17079o
            java.lang.Object r3 = zh.c.c()
            int r4 = r0.f17081q
            r5 = 1
            switch(r4) {
                case 0: goto L_0x003f;
                case 1: goto L_0x0034;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            int r3 = r0.f17078n
            java.lang.Object r4 = r0.f17077m
            qg.a r4 = (qg.a) r4
            wh.j.b(r1)
            r6 = r1
            goto L_0x006e
        L_0x003f:
            wh.j.b(r1)
            r4 = r16
            r8 = r18
            r13 = r22
            r10 = r20
            r6 = r17
            android.location.Geocoder r7 = new android.location.Geocoder
            java.util.Locale r12 = java.util.Locale.getDefault()
            r7.<init>(r6, r12)
            ni.x r14 = ni.o0.b()
            qg.a$c r15 = new qg.a$c
            r12 = 0
            r6 = r15
            r6.<init>(r7, r8, r10, r12)
            r0.f17077m = r4
            r0.f17078n = r13
            r0.f17081q = r5
            java.lang.Object r6 = ni.e.c(r14, r15, r0)
            if (r6 != r3) goto L_0x006d
            return r3
        L_0x006d:
            r3 = r13
        L_0x006e:
            java.lang.String r6 = (java.lang.String) r6
            if (r3 != r5) goto L_0x0079
            androidx.databinding.j<java.lang.String> r3 = r4.f17066f
            r3.h(r6)
            goto L_0x007e
        L_0x0079:
            androidx.databinding.j<java.lang.String> r3 = r4.f17067g
            r3.h(r6)
        L_0x007e:
            wh.o r3 = wh.o.f20355a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.l(android.content.Context, double, double, int, yh.d):java.lang.Object");
    }

    @ai.f(c = "com.taxinadriver.viewmodel.googleapis.DirectionViewModel$fetchLocality$result$1", f = "DirectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: DirectionViewModel.kt */
    public static final class c extends k implements p<c0, yh.d<? super String>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Geocoder f17082m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ double f17083n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ double f17084o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Geocoder geocoder, double d10, double d11, yh.d<? super c> dVar) {
            super(2, dVar);
            this.f17082m = geocoder;
            this.f17083n = d10;
            this.f17084o = d11;
        }

        public final yh.d<o> create(Object obj, yh.d<?> dVar) {
            return new c(this.f17082m, this.f17083n, this.f17084o, dVar);
        }

        public final Object invoke(c0 c0Var, yh.d<? super String> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(o.f20355a);
        }

        public final Object invokeSuspend(Object obj) {
            zh.c.c();
            switch (0) {
                case 0:
                    wh.j.b(obj);
                    try {
                        List addresses = this.f17082m.getFromLocation(this.f17083n, this.f17084o, 1);
                        boolean z10 = true;
                        if (!(addresses != null && (addresses.isEmpty() ^ true))) {
                            return BuildConfig.FLAVOR;
                        }
                        if (addresses.get(0).getSubLocality() != null) {
                            String subLocality = addresses.get(0).getSubLocality();
                            Intrinsics.checkNotNullExpressionValue(subLocality, "addresses[0].subLocality");
                            if (subLocality.length() != 0) {
                                z10 = false;
                            }
                            if (!z10) {
                                return addresses.get(0).getSubLocality();
                            }
                        }
                        return addresses.get(0).getLocality();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return BuildConfig.FLAVOR;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void n(String google_key, LatLng pickup_address, LatLng drop_address) {
        Intrinsics.checkNotNullParameter(google_key, "google_key");
        Intrinsics.checkNotNullParameter(pickup_address, "pickup_address");
        Intrinsics.checkNotNullParameter(drop_address, "drop_address");
        Ref.ObjectRef request_url = new Ref.ObjectRef();
        request_url.element = "https://maps.googleapis.com/maps/api/directions/json?";
        request_url.element = ((String) request_url.element) + "origin=" + pickup_address.f6114m + ',' + pickup_address.f6115n;
        request_url.element = ((String) request_url.element) + "&destination=" + drop_address.f6114m + ',' + drop_address.f6115n;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) request_url.element);
        sb2.append("&optimize:true");
        request_url.element = sb2.toString();
        request_url.element = ((String) request_url.element) + "&mode=driving&key=" + google_key;
        d1 unused = ni.f.b(n0.a(this), o0.b(), (e0) null, new e(this, request_url, (yh.d<? super e>) null), 2);
    }

    @ai.f(c = "com.taxinadriver.viewmodel.googleapis.DirectionViewModel$getDirectionPassengerApi$1", f = "DirectionViewModel.kt", l = {}, m = "invokeSuspend")
    /* compiled from: DirectionViewModel.kt */
    public static final class e extends k implements p<c0, yh.d<? super o>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a f17087m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f17088n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar, Ref.ObjectRef<String> objectRef, yh.d<? super e> dVar) {
            super(2, dVar);
            this.f17087m = aVar;
            this.f17088n = objectRef;
        }

        public final yh.d<o> create(Object obj, yh.d<?> dVar) {
            return new e(this.f17087m, this.f17088n, dVar);
        }

        public final Object invoke(c0 c0Var, yh.d<? super o> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(o.f20355a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
            if (r3 == null) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
            if (r3 == null) goto L_0x0094;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.String r0 = "status"
                zh.c.c()
                r1 = 0
                switch(r1) {
                    case 0: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0011:
                wh.j.b(r12)
                r2 = r11
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                qg.a r5 = r2.f17087m     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                androidx.lifecycle.z r5 = r5.f17075o     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                mg.c$c r6 = new mg.c$c     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r6.<init>()     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r5.l(r6)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r6 = r2.f17088n     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                T r6 = r6.element     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                java.net.URLConnection r6 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                if (r6 == 0) goto L_0x005f
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r3 = r6
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r6 = 0
                r7 = 1024(0x400, float:1.435E-42)
                char[] r7 = new char[r7]     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
            L_0x004c:
                int r8 = r5.read(r7)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                r9 = r8
                r10 = 0
                r6 = r9
                r9 = -1
                if (r8 == r9) goto L_0x005a
                r4.append(r7, r1, r6)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                goto L_0x004c
            L_0x005a:
            L_0x005b:
                r3.disconnect()
                goto L_0x0094
            L_0x005f:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                java.lang.String r6 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
                throw r5     // Catch:{ MalformedURLException -> 0x007f, IOException -> 0x006a }
            L_0x0067:
                r0 = move-exception
                goto L_0x017c
            L_0x006a:
                r5 = move-exception
                qg.a r5 = r2.f17087m     // Catch:{ all -> 0x0067 }
                androidx.lifecycle.z r5 = r5.f17075o     // Catch:{ all -> 0x0067 }
                mg.c$b r6 = new mg.c$b     // Catch:{ all -> 0x0067 }
                java.lang.String r7 = "IOException"
                r6.<init>(r7)     // Catch:{ all -> 0x0067 }
                r5.l(r6)     // Catch:{ all -> 0x0067 }
                if (r3 == 0) goto L_0x0094
            L_0x007e:
                goto L_0x005b
            L_0x007f:
                r5 = move-exception
                qg.a r5 = r2.f17087m     // Catch:{ all -> 0x0067 }
                androidx.lifecycle.z r5 = r5.f17075o     // Catch:{ all -> 0x0067 }
                mg.c$b r6 = new mg.c$b     // Catch:{ all -> 0x0067 }
                java.lang.String r7 = "MalformedURLException"
                r6.<init>(r7)     // Catch:{ all -> 0x0067 }
                r5.l(r6)     // Catch:{ all -> 0x0067 }
                if (r3 == 0) goto L_0x0094
                goto L_0x007e
            L_0x0094:
                r3 = 1
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r6 = r4.toString()     // Catch:{ JSONException -> 0x0132 }
                r5.<init>(r6)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r6 = r5.optString(r0)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r7 = "OK"
                boolean r6 = mi.n.l(r6, r7, r3)     // Catch:{ JSONException -> 0x0132 }
                if (r6 != 0) goto L_0x00da
                qg.a r1 = r2.f17087m     // Catch:{ JSONException -> 0x0132 }
                androidx.lifecycle.z r1 = r1.f17075o     // Catch:{ JSONException -> 0x0132 }
                mg.c$b r4 = new mg.c$b     // Catch:{ JSONException -> 0x0132 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0132 }
                r6.<init>()     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r0 = r5.optString(r0)     // Catch:{ JSONException -> 0x0132 }
                r6.append(r0)     // Catch:{ JSONException -> 0x0132 }
                r0 = 32
                r6.append(r0)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r0 = "error_message"
                java.lang.String r0 = r5.optString(r0)     // Catch:{ JSONException -> 0x0132 }
                r6.append(r0)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x0132 }
                r4.<init>(r0)     // Catch:{ JSONException -> 0x0132 }
                r1.l(r4)     // Catch:{ JSONException -> 0x0132 }
                goto L_0x0179
            L_0x00da:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0132 }
                r0.<init>()     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r6 = "directionResult"
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r8 = r4.toString()     // Catch:{ JSONException -> 0x0132 }
                r7.<init>(r8)     // Catch:{ JSONException -> 0x0132 }
                r0.put(r6, r7)     // Catch:{ JSONException -> 0x0132 }
                qg.a r4 = r2.f17087m     // Catch:{ JSONException -> 0x0132 }
                androidx.lifecycle.z r4 = r4.o()     // Catch:{ JSONException -> 0x0132 }
                r4.l(r0)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r4 = "routes"
                org.json.JSONArray r4 = r5.getJSONArray(r4)     // Catch:{ JSONException -> 0x0132 }
                org.json.JSONObject r1 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r5 = "overview_polyline"
                org.json.JSONObject r5 = r1.getJSONObject(r5)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r6 = "waypoint_order"
                org.json.JSONArray r6 = r1.getJSONArray(r6)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r7 = r6.toString()     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r8 = "j_array_way.toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch:{ JSONException -> 0x0132 }
                qg.a r8 = r2.f17087m     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r9 = "legs"
                org.json.JSONArray r9 = r1.getJSONArray(r9)     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r10 = "j_obj_array.getJSONArray(\"legs\")"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)     // Catch:{ JSONException -> 0x0132 }
                r8.w(r9)     // Catch:{ JSONException -> 0x0132 }
                qg.a r8 = r2.f17087m     // Catch:{ JSONException -> 0x0132 }
                java.lang.String r9 = "points"
                java.lang.String r9 = r5.optString(r9)     // Catch:{ JSONException -> 0x0132 }
                r8.k(r9)     // Catch:{ JSONException -> 0x0132 }
                goto L_0x0179
            L_0x0132:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L_0x0179
                java.lang.String r1 = r0.getMessage()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r4 = "Unable to resolve host"
                boolean r1 = mi.o.w(r1, r4, r3)
                if (r1 != 0) goto L_0x0169
                java.lang.String r1 = r0.getMessage()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r4 = "Failed to connect"
                boolean r1 = mi.o.w(r1, r4, r3)
                if (r1 != 0) goto L_0x0169
                java.lang.String r1 = r0.getMessage()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.String r0 = "timeout"
                boolean r0 = mi.o.w(r1, r0, r3)
                if (r0 == 0) goto L_0x0179
            L_0x0169:
                qg.a r0 = r2.f17087m
                androidx.lifecycle.z r0 = r0.f17075o
                mg.c$b r1 = new mg.c$b
                java.lang.String r3 = "Please check your internet connection."
                r1.<init>(r3)
                r0.l(r1)
            L_0x0179:
                wh.o r0 = wh.o.f20355a
                return r0
            L_0x017c:
                if (r3 == 0) goto L_0x0182
                r3.disconnect()
            L_0x0182:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
