package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11573Index is a Querydsl query type for QPgToast11573Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11573Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11573Index> {

    private static final long serialVersionUID = 874507341;

    public static final QPgToast11573Index pgToast11573Index = new QPgToast11573Index("pg_toast_11573_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11573Index(String variable) {
        super(QPgToast11573Index.class, forVariable(variable), "pg_toast", "pg_toast_11573_index");
    }

    @SuppressWarnings("all")
    public QPgToast11573Index(Path<? extends QPgToast11573Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11573_index");
    }

    public QPgToast11573Index(PathMetadata<?> metadata) {
        super(QPgToast11573Index.class, metadata, "pg_toast", "pg_toast_11573_index");
    }

}

