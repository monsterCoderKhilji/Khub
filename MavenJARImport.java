public final class Maybes {

    public static <A, B> Maybe<B> flatMap(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1) {
        return ma.flatMap(f1::apply);
    }

    public static <A, B> Maybe<B> map(
            Maybe<A> ma,
            Function1<A, B> f1) {
        return ma.map(f1::apply);
    }

    public static <A, B, C> Maybe<C> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2) {
        return flatMap(ma, a -> f1.apply(a).flatMap(b -> f2.apply(a, b)));
    }

    public static <A, B, C, D> Maybe<D> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a)));
    }

    public static <A, B, C, D, E> Maybe<E> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a)));
    }

    public static <A, B, C, D, E, F> Maybe<F> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a)));
    }

    public static <A, B, C, D, E, F, G> Maybe<G> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, Maybe<G>> f6) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a)));
    }

    public static <A, B, C, D, E, F, G, H> Maybe<H> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, Maybe<G>> f6,
            Function7<A, B, C, D, E, F, G, Maybe<H>> f7) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a), f7.apply(a)));
    }

    public static <A, B, C, D, E, F, G, H, I> Maybe<I> _for(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, Maybe<G>> f6,
            Function7<A, B, C, D, E, F, G, Maybe<H>> f7,
            Function8<A, B, C, D, E, F, G, H, Maybe<I>> f8) {
        return ma.flatMap(a -> _for(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a), f7.apply(a), f8.apply(a)));
    }

    public static <A, B, C> Maybe<C> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, C> f2) {
        return ma.flatMap(a -> map(f1.apply(a), f2.apply(a)));
    }

    public static <A, B, C, D> Maybe<D> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, D> f3) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a)));
    }

    public static <A, B, C, D, E> Maybe<E> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, E> f4) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a)));
    }


    public static <A, B, C, D, E, F> Maybe<F> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, F> f5) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a)));
    }

    public static <A, B, C, D, E, F, G> Maybe<G> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, G> f6) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a)));
    }

    public static <A, B, C, D, E, F, G, H> Maybe<H> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, Maybe<G>> f6,
            Function7<A, B, C, D, E, F, G, H> f7) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a), f7.apply(a)));
    }

    public static <A, B, C, D, E, F, G, H, I> Maybe<I> _forY(
            Maybe<A> ma,
            Function1<A, Maybe<B>> f1,
            Function2<A, B, Maybe<C>> f2,
            Function3<A, B, C, Maybe<D>> f3,
            Function4<A, B, C, D, Maybe<E>> f4,
            Function5<A, B, C, D, E, Maybe<F>> f5,
            Function6<A, B, C, D, E, F, Maybe<G>> f6,
            Function7<A, B, C, D, E, F, G, Maybe<H>> f7,
            Function8<A, B, C, D, E, F, G, H, I> f8) {
        return ma.flatMap(a -> _forY(f1.apply(a), f2.apply(a), f3.apply(a), f4.apply(a), f5.apply(a), f6.apply(a), f7.apply(a), f8.apply(a)));
    }

    public static <A> Maybe<A> eventually(Option<A> ma) {
        return ma.map(Maybe::just).getOrElse(Maybe.empty());
    }
}
