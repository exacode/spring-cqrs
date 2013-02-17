package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11578Index is a Querydsl query type for QPgToast11578Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11578Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11578Index> {

    private static final long serialVersionUID = 1017653096;

    public static final QPgToast11578Index pgToast11578Index = new QPgToast11578Index("pg_toast_11578_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11578Index(String variable) {
        super(QPgToast11578Index.class, forVariable(variable), "pg_toast", "pg_toast_11578_index");
    }

    @SuppressWarnings("all")
    public QPgToast11578Index(Path<? extends QPgToast11578Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11578_index");
    }

    public QPgToast11578Index(PathMetadata<?> metadata) {
        super(QPgToast11578Index.class, metadata, "pg_toast", "pg_toast_11578_index");
    }

}

