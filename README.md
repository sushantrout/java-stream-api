# java-stream-api
<h3>Generate Stream</h3>
<ol>
	<li> public static <T> java.util.stream.Stream$Builder<T> builder(); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> empty(); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> of(T); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> of(T...); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> iterate(T, java.util.function.UnaryOperator<T>); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> generate(java.util.function.Supplier<T>); <br><br></li>
  <li> public static <T> java.util.stream.Stream<T> concat(java.util.stream.Stream<? extends T>, java.util.stream.Stream<? extends T>); <br><br><br><br></li>
  </ol>
  
  <h3>Filter Stream</h3>
  
  <ol>
	<li> public abstract java.util.stream.Stream<T> filter(java.util.function.Predicate<? super T>); <br><br></li>
	<li> public abstract boolean anyMatch(java.util.function.Predicate<? super T>); <br><br></li>
	<li> public abstract boolean allMatch(java.util.function.Predicate<? super T>); <br><br></li>
	<li> public abstract boolean noneMatch(java.util.function.Predicate<? super T>); <br><br></li>
	<li> public abstract java.util.Optional<T> findFirst(); <br><br></li>
	<li> public abstract java.util.Optional<T> findAny(); <br><br></li>
	<li>public default java.util.stream.Stream<T> takeWhile(java.util.function.Predicate<? super T>);<br><br></li>
	<li>public default java.util.stream.Stream<T> dropWhile(java.util.function.Predicate<? super T>);<br><br></li>
  </ol>

<h3>Map Stream</h3>
<ol>
  <li> public abstract <R> java.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R>); <br><br></li>
  <li> public abstract java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction<? super T>); <br><br></li>
  <li> public abstract java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction<? super T>); <br><br></li>
  <li> public abstract java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction<? super T>); <br><br></li>
  <li> public abstract <R> java.util.stream.Stream<R> flatMap(java.util.function.Function<? super T, ? extends java.util.stream.Stream<? extends R>>); <br><br></li>
  <li> public abstract java.util.stream.IntStream flatMapToInt(java.util.function.Function<? super T, ? extends java.util.stream.IntStream>); <br><br></li>
  <li> public abstract java.util.stream.LongStream flatMapToLong(java.util.function.Function<? super T, ? extends java.util.stream.LongStream>); <br><br></li>
  <li> public abstract java.util.stream.DoubleStream flatMapToDouble(java.util.function.Function<? super T, ? extends java.util.stream.DoubleStream>); <br><br></li>
</ol>

<h3>Reduce Stream</h3>
<ol>
	<li> public abstract T reduce(T, java.util.function.BinaryOperator<T>); <br><br></li>
  <li> public abstract java.util.Optional<T> reduce(java.util.function.BinaryOperator<T>); <br><br></li>
  <li> public abstract <U> U reduce(U, java.util.function.BiFunction<U, ? super T, U>, java.util.function.BinaryOperator<U>); <br><br></li>
</ol>

<h3>Sort Stream</h3>
<ol>
	<li> public abstract java.util.stream.Stream<T> sorted(); <br><br></li>
  <li> public abstract java.util.stream.Stream<T> sorted(java.util.Comparator<? super T>); <br><br></li>
</ol>

<h3>Iterate Stream</h3>
<ol>
	<li> public abstract void forEach(java.util.function.Consumer<? super T>); <br><br></li>
  <li> public abstract void forEachOrdered(java.util.function.Consumer<? super T>); <br><br></li>
  <li> public abstract java.lang.Object[] toArray(); <br><br></li>
  <li> public abstract <A> A[] toArray(java.util.function.IntFunction<A[]>); <br><br></li>
</ol>

<h3>Collect Stream</h3>
<ol>
<li> public abstract java.util.stream.Stream<T> distinct(); <br><br></li>
<li> public abstract java.util.stream.Stream<T> peek(java.util.function.Consumer<? super T>); <br><br></li>
	<li> public abstract java.util.stream.Stream<T> limit(long); <br><br></li>
	<li> public abstract java.util.stream.Stream<T> skip(long); <br><br></li>
<li> public abstract java.util.Optional<T> min(java.util.Comparator<? super T>); <br><br></li>
	<li> public abstract java.util.Optional<T> max(java.util.Comparator<? super T>); <br><br></li>
	<li> public abstract <R> R collect(java.util.function.Supplier<R>, java.util.function.BiConsumer<R, ? super T>, java.util.function.BiConsumer<R, R>); <br><br></li>
  <li> public abstract <R, A> R collect(java.util.stream.Collector<? super T, A, R>); <br><br></li>
  
  <li> public abstract long count(); <br><br></li>
</ol>