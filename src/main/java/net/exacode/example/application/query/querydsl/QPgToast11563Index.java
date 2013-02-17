package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11563Index is a Querydsl query type for QPgToast11563Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11563Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11563Index> {

    private static final long serialVersionUID = -12996340;

    public static final QPgToast11563Index pgToast11563Index = new QPgToast11563Index("pg_toast_11563_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11563Index(String variable) {
        super(QPgToast11563Index.class, forVariable(variable), "pg_toast", "pg_toast_11563_index");
    }

    @SuppressWarnings("all")
    public QPgToast11563Index(Path<? extends QPgToast11563Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11563_index");
    }

    public QPgToast11563Index(PathMetadata<?> metadata) {
        super(QPgToast11563Index.class, metadata, "pg_toast", "pg_toast_11563_index");
    }

}

