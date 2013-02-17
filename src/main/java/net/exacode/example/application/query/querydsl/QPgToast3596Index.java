package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast3596Index is a Querydsl query type for QPgToast3596Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast3596Index extends com.mysema.query.sql.RelationalPathBase<QPgToast3596Index> {

    private static final long serialVersionUID = -969859865;

    public static final QPgToast3596Index pgToast3596Index = new QPgToast3596Index("pg_toast_3596_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast3596Index(String variable) {
        super(QPgToast3596Index.class, forVariable(variable), "pg_toast", "pg_toast_3596_index");
    }

    @SuppressWarnings("all")
    public QPgToast3596Index(Path<? extends QPgToast3596Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_3596_index");
    }

    public QPgToast3596Index(PathMetadata<?> metadata) {
        super(QPgToast3596Index.class, metadata, "pg_toast", "pg_toast_3596_index");
    }

}

