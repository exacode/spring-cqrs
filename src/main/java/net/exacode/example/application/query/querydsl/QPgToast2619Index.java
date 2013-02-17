package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2619Index is a Querydsl query type for QPgToast2619Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2619Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2619Index> {

    private static final long serialVersionUID = -138769766;

    public static final QPgToast2619Index pgToast2619Index = new QPgToast2619Index("pg_toast_2619_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2619Index(String variable) {
        super(QPgToast2619Index.class, forVariable(variable), "pg_toast", "pg_toast_2619_index");
    }

    @SuppressWarnings("all")
    public QPgToast2619Index(Path<? extends QPgToast2619Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2619_index");
    }

    public QPgToast2619Index(PathMetadata<?> metadata) {
        super(QPgToast2619Index.class, metadata, "pg_toast", "pg_toast_2619_index");
    }

}

