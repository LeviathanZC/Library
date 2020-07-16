package by.zercomp.library.model.converter;

public interface Converter<T, U> {

    U convert(T book);

}
