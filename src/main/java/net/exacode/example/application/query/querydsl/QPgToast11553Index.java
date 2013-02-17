package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11553Index is a Querydsl query type for QPgToast11553Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11553Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11553Index> {

    private static final long serialVersionUID = -900500021;

    public static final QPgToast11553Index pgToast11553Index = new QPgToast11553Index("pg_toast_11553_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11553Index(String variable) {
        super(QPgToast11553Index.class, forVariable(variable), "pg_toast", "pg_toast_11553_index");
    }

    @SuppressWarnings("all")
    public QPgToast11553Index(Path<? extends QPgToast11553Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11553_index");
    }

    public QPgToast11553Index(PathMetadata<?> metadata) {
        super(QPgToast11553Index.class, metadata, "pg_toast", "pg_toast_11553_index");
    }

}

